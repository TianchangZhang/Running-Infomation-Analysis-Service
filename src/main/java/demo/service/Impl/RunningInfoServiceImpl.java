package demo.service.Impl;

import demo.domain.RunningInfo;
import demo.domain.RunningInfoRepository;
import demo.service.RunningInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RunningInfoServiceImpl implements RunningInfoService{

    private RunningInfoRepository runningInfoRepository;

    @Autowired
    public RunningInfoServiceImpl(RunningInfoRepository runningInfoRepository) {
        this.runningInfoRepository = runningInfoRepository;
    }

    @Override
    public List<RunningInfo> saveRunningInformation(List<RunningInfo> runningInformationList) {
        return runningInfoRepository.save(runningInformationList);
    }

    @Override
    public void deleteAll() {
        runningInfoRepository.deleteAll();
    }

    @Override
    public void deleteByRunningId(String runningId) {
        runningInfoRepository.deleteByRunningId(runningId);
    }

    @Override
    public Page<RunningInfo> findByRunningId(String runningId, Pageable pageable) {
        return runningInfoRepository.findByRunningId(runningId,pageable);
    }

    @Override
    public Page<RunningInfo> findAll(Pageable pageable) {
        return runningInfoRepository.findAllByOrderByHeartRateDesc(pageable);
    }
}