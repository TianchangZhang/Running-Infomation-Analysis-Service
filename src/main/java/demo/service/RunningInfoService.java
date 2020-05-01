package demo.service;

import demo.domain.RunningInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RunningInfoService {
    List<RunningInfo> saveRunningInformation(List<RunningInfo> runningInformationList);

    void deleteAll();

    void deleteByRunningId(String runningId);

    Page<RunningInfo> findByRunningId(String runningId, Pageable pageable);

    Page<RunningInfo> findAll(Pageable pageable);
}