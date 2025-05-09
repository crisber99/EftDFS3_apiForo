#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.Voto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VotosRepository extends JpaRepository<Votos, Long> {

}
