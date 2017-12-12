package comparators;

import java.util.Comparator;

import model.Aluno;

public class SearchByName implements Comparator<Aluno> {

	@Override
	public int compare(Aluno o1, Aluno o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
