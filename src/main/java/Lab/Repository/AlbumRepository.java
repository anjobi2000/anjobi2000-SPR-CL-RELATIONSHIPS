package Lab.Repository;

import Lab.Model.Album;
import Lab.Model.Artist;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 * JPARepository that will be used to preform persistence operations on Album objects
 */
public interface AlbumRepository extends JpaRepository<Album, Long> {
}
