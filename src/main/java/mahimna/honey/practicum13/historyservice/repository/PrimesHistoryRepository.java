package mahimna.honey.practicum13.historyservice.repository;

import mahimna.honey.practicum13.historyservice.model.PrimesRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PrimesHistoryRepository
    extends CrudRepository<PrimesRecord, Integer>{
    List<PrimesRecord> findAllByCustomer(String customer);
}
