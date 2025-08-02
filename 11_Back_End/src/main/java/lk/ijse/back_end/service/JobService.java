package lk.ijse.back_end.service;


import lk.ijse.back_end.dto.JobDTO;

import java.util.List;

public interface JobService {
    void saveJob(JobDTO jobDTO);

    void updateJob(JobDTO jobDTO);

    List<JobDTO> getAllJobs();

    void changeJobStatus(String jobId);

    List<JobDTO> getAllJobsByKeyword(String keyword);
}