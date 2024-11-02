package ma.emsi.jaxwebservices.repository;

import ma.emsi.jaxwebservices.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}
