package APP.RepositoryPackage;

import APP.Domain.TestConnectivityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestConnectivityEntity, Integer> {
}