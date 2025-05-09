#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.Tema;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TemasRepository extends JpaRepository<Temas, Long> {

}
