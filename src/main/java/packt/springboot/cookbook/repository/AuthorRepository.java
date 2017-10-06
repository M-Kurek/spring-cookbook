package packt.springboot.cookbook.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import packt.springboot.cookbook.entity.Author;


/*
wanted	to	change	the	URL	path	or	rel	value,	to	writers	instead	of	authors, we	could	have	tuned	the	annotation,
as	follows: @RepositoryRestResource(collectionResourceRel	=	"writers",	path	=	"writers")
 */
@RepositoryRestResource
public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {
}