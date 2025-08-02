const pageSize = 5;
let currentPage = 1;
let jobData = [];

function paginate(data, page) {
    const start = (page - 1) * pageSize;
    return data.slice(start, start + pageSize);
}

function renderPagination(totalItems) {
    const pageCount = Math.ceil(totalItems / pageSize);
    const pagination = $('#pagination');
    pagination.html('');

    for (let i = 1; i <= pageCount; i++) {
        const activeClass = i === currentPage ? 'active' : '';
        pagination.append(`<li class="page-item ${activeClass}"><a class="page-link pagination-btn">${i}</a></li>`);
    }

    $('.pagination-btn').click(function () {
        currentPage = parseInt($(this).text());
        renderTable();
    });
}

function renderTable() {
    const tableBody = $('#jobsTableBody');
    tableBody.empty();
    const paginatedData = paginate(jobData, currentPage);

    paginatedData.forEach(job => {
        tableBody.append(`
            <tr>
                <td>${job.id}</td>
                <td>${job.jobTitle}</td>
                <td>${job.company}</td>
                <td>${job.description}</td>
                <td>${job.location}</td>
                <td>${job.type}</td>
                <td>${job.status}</td>
                <td>
                    <button class="btn btn-sm btn-primary" onclick="changestatus(${job.id})">Change Status</button>
                    <button class="btn btn-sm btn-warning" onclick="populateEditModal(${job.id})" data-bs-toggle="modal" data-bs-target="#editJobModal">
                        <i class="bi bi-pencil-square"></i> Edit
                    </button>
                </td>
            </tr>
        `);
    });
    renderPagination(jobData.length);
}

function loadTable() {
    fetch('http://localhost:8080/api/v1/job/getall')
        .then(res => res.json())
        .then(resp => {
            jobData = resp.data;
            currentPage = 1;
            renderTable();
        })
        .catch(error => {
            console.error('Error fetching data:', error);
            Swal.fire('Error', 'Unable to load job data', 'error');
        });
}

function searchJobs(query) {
    fetch(`http://localhost:8080/api/v1/job/search/${encodeURIComponent(query)}`)
        .then(res => res.json())
        .then(resp => {
            jobData = resp.data;
            currentPage = 1;
            renderTable();
        })
        .catch(error => {
            console.error('Error fetching search results:', error);
            Swal.fire('Error', 'Failed to fetch search results', 'error');
        });
}

function changestatus(id) {
    Swal.fire({
        title: 'Are you sure?',
        text: 'Do you want to change the status of this job?',
        icon: 'warning',
        showCancelButton: true,
        confirmButtonText: 'Yes, change it!',
        cancelButtonText: 'Cancel'
    }).then((result) => {
        if (result.isConfirmed) {
            fetch(`http://localhost:8080/api/v1/job/status/${id}`, {
                method: 'PATCH',
                headers: { 'Content-Type': 'application/json' }
            })
                .then(response => {
                    if (response.ok) {
                        Swal.fire('Updated!', 'Job status has been changed.', 'success');
                        loadTable();
                    } else {
                        Swal.fire('Error!', 'Failed to update job status.', 'error');
                    }
                })
                .catch(() => Swal.fire('Error!', 'Something went wrong.', 'error'));
        }
    });
}

function populateEditModal(id) {
    const job = jobData.find(j => j.id === id);
    if (!job) return;

    $('#editJobId').val(job.id);
    $('#editJobTitle').val(job.jobTitle);
    $('#editCompanyName').val(job.company);
    $('#editJobLocation').val(job.location);
    $('#editJobType').val(job.type);
    $('#editJobDescription').val(job.description);
}

$('#updateJobBtn').on('click', function () {
    const jobData = {
        id: $('#editJobId').val(),
        jobTitle: $('#editJobTitle').val(),
        company: $('#editCompanyName').val(),
        location: $('#editJobLocation').val(),
        type: $('#editJobType').val(),
        description: $('#editJobDescription').val(),
        status: 'Active'
    };
    if (!jobData.jobTitle || !jobData.company || !jobData.location || !jobData.type || !jobData.description) {
        Swal.fire('Warning', 'Please fill in all fields.', 'warning');
        return;
    }
    $.ajax({
        url: `http://localhost:8080/api/v1/job/update`,
        method: 'PUT',
        contentType: 'application/json',
        data: JSON.stringify(jobData),
        success: function (res) {
            Swal.fire('Success', 'Job updated successfully!', 'success');
            loadTable();
            $('#editJobModal').modal('hide');
        },
        error: function (xhr) {
            Swal.fire('Error', xhr.responseText || 'Failed to update job', 'error');
        }
    });
});

$('#saveJobBtn').on('click', function () {
    const jobData = {
        jobTitle: $('#jobTitle').val(),
        company: $('#companyName').val(),
        location: $('#jobLocation').val(),
        type: $('#jobType').val(),
        description: $('#jobDescription').val()
    };
    if (!jobData.jobTitle || !jobData.company || !jobData.location || !jobData.type || !jobData.description) {
        Swal.fire('Warning', 'Please fill in all fields.', 'warning');
        return;
    }
    $.ajax({
        url: 'http://localhost:8080/api/v1/job/create',
        method: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(jobData),
        success: function (res) {
            Swal.fire('Success', 'Job saved successfully!', 'success');
            loadTable();
            $('#addJobModal').modal('hide');
        },
        error: function (xhr) {
            Swal.fire('Error', xhr.responseText || 'Failed to save job', 'error');
        }
    });
});

$(document).ready(function () {
    loadTable();
    $('#searchInput').on('input', function () {
        const query = $(this).val().trim();
        if (query.length >= 3) {
            searchJobs(query);
        } else {
            loadTable();
        }
    });
});
