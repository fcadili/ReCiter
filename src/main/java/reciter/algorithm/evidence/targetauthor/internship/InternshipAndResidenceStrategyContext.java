package reciter.algorithm.evidence.targetauthor.internship;

import java.util.List;

import reciter.algorithm.evidence.targetauthor.TargetAuthorStrategy;
import reciter.algorithm.evidence.targetauthor.TargetAuthorStrategyContext;
import reciter.model.article.ReCiterArticle;
import reciter.model.author.TargetAuthor;

public class InternshipAndResidenceStrategyContext implements TargetAuthorStrategyContext{
	private final TargetAuthorStrategy strategy;
	private double strategyScore;
	
	public InternshipAndResidenceStrategyContext(TargetAuthorStrategy strategy) {
		this.strategy = strategy;
	}
	
	@Override
	public double executeStrategy(ReCiterArticle reCiterArticle, TargetAuthor targetAuthor) {
		strategyScore = strategy.executeStrategy(reCiterArticle, targetAuthor);
		return strategyScore;
	}

	@Override
	public double executeStrategy(List<ReCiterArticle> reCiterArticles, TargetAuthor targetAuthor) {
		return strategy.executeStrategy(reCiterArticles, targetAuthor);
	}
}