package paytm;

import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import org.apache.commons.configuration.Configuration;
import org.apache.tinkerpop.gremlin.process.computer.Computer;
import org.apache.tinkerpop.gremlin.process.computer.GraphComputer;
import org.apache.tinkerpop.gremlin.process.remote.RemoteConnection;
import org.apache.tinkerpop.gremlin.process.traversal.Bindings;
import org.apache.tinkerpop.gremlin.process.traversal.TraversalStrategies;
import org.apache.tinkerpop.gremlin.process.traversal.TraversalStrategy;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversal;
import org.apache.tinkerpop.gremlin.process.traversal.step.map.AddVertexStartStep;
import org.apache.tinkerpop.gremlin.process.traversal.step.map.GraphStep;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Graph;
import org.apache.tinkerpop.gremlin.structure.Vertex;

public class SocialTraversalSource extends SocialTraversalSourceDsl {
  public SocialTraversalSource(Graph graph) {
    super(graph);
  }

  public SocialTraversalSource(Graph graph, TraversalStrategies strategies) {
    super(graph, strategies);
  }

  @Override
  public SocialTraversalSource clone() {
    return (SocialTraversalSource) super.clone();
  }

  @Override
  public SocialTraversalSource withStrategies(TraversalStrategy... traversalStrategies) {
    return (SocialTraversalSource) super.withStrategies(traversalStrategies);
  }

  @Override
  public SocialTraversalSource withoutStrategies(Class<? extends TraversalStrategy>... traversalStrategyClasses) {
    return (SocialTraversalSource) super.withoutStrategies(traversalStrategyClasses);
  }

  @Override
  public SocialTraversalSource withBindings(Bindings bindings) {
    return (SocialTraversalSource) super.withBindings(bindings);
  }

  @Override
  public SocialTraversalSource withComputer(Computer computer) {
    return (SocialTraversalSource) super.withComputer(computer);
  }

  @Override
  public SocialTraversalSource withComputer(Class<? extends GraphComputer> graphComputerClass) {
    return (SocialTraversalSource) super.withComputer(graphComputerClass);
  }

  @Override
  public SocialTraversalSource withComputer() {
    return (SocialTraversalSource) super.withComputer();
  }

  @Override
  public <A> SocialTraversalSource withSideEffect(String key, Supplier<A> initialValue,
      BinaryOperator<A> reducer) {
    return (SocialTraversalSource) super.withSideEffect(key,initialValue,reducer);
  }

  @Override
  public <A> SocialTraversalSource withSideEffect(String key, A initialValue,
      BinaryOperator<A> reducer) {
    return (SocialTraversalSource) super.withSideEffect(key,initialValue,reducer);
  }

  @Override
  public <A> SocialTraversalSource withSideEffect(String key, A initialValue) {
    return (SocialTraversalSource) super.withSideEffect(key,initialValue);
  }

  @Override
  public <A> SocialTraversalSource withSideEffect(String key, Supplier<A> initialValue) {
    return (SocialTraversalSource) super.withSideEffect(key,initialValue);
  }

  @Override
  public <A> SocialTraversalSource withSack(Supplier<A> initialValue,
      UnaryOperator<A> splitOperator, BinaryOperator<A> mergeOperator) {
    return (SocialTraversalSource) super.withSack(initialValue,splitOperator,mergeOperator);
  }

  @Override
  public <A> SocialTraversalSource withSack(A initialValue, UnaryOperator<A> splitOperator,
      BinaryOperator<A> mergeOperator) {
    return (SocialTraversalSource) super.withSack(initialValue,splitOperator,mergeOperator);
  }

  @Override
  public <A> SocialTraversalSource withSack(A initialValue) {
    return (SocialTraversalSource) super.withSack(initialValue);
  }

  @Override
  public <A> SocialTraversalSource withSack(Supplier<A> initialValue) {
    return (SocialTraversalSource) super.withSack(initialValue);
  }

  @Override
  public <A> SocialTraversalSource withSack(Supplier<A> initialValue,
      UnaryOperator<A> splitOperator) {
    return (SocialTraversalSource) super.withSack(initialValue,splitOperator);
  }

  @Override
  public <A> SocialTraversalSource withSack(A initialValue, UnaryOperator<A> splitOperator) {
    return (SocialTraversalSource) super.withSack(initialValue,splitOperator);
  }

  @Override
  public <A> SocialTraversalSource withSack(Supplier<A> initialValue,
      BinaryOperator<A> mergeOperator) {
    return (SocialTraversalSource) super.withSack(initialValue,mergeOperator);
  }

  @Override
  public <A> SocialTraversalSource withSack(A initialValue, BinaryOperator<A> mergeOperator) {
    return (SocialTraversalSource) super.withSack(initialValue,mergeOperator);
  }

  @Override
  public SocialTraversalSource withBulk(boolean useBulk) {
    return (SocialTraversalSource) super.withBulk(useBulk);
  }

  @Override
  public SocialTraversalSource withPath() {
    return (SocialTraversalSource) super.withPath();
  }

  @Override
  public SocialTraversalSource withRemote(Configuration conf) {
    return (SocialTraversalSource) super.withRemote(conf);
  }

  @Override
  public SocialTraversalSource withRemote(String configFile) throws Exception {
    return (SocialTraversalSource) super.withRemote(configFile);
  }

  @Override
  public SocialTraversalSource withRemote(RemoteConnection connection) {
    return (SocialTraversalSource) super.withRemote(connection);
  }

  @Override
  public SocialTraversal<Vertex, Vertex> persons(String... names) {
    SocialTraversalSource clone = this.clone();
    return new DefaultSocialTraversal (clone, super.persons(names).asAdmin());
  }

  @Override
  public SocialTraversal<Vertex, Vertex> addV() {
    SocialTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.addV);
    DefaultSocialTraversal traversal = new DefaultSocialTraversal(clone);
    return (SocialTraversal) traversal.asAdmin().addStep(new AddVertexStartStep(traversal, null));
  }

  @Override
  public SocialTraversal<Vertex, Vertex> addV(String label) {
    SocialTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.addV, label);
    DefaultSocialTraversal traversal = new DefaultSocialTraversal(clone);
    return (SocialTraversal) traversal.asAdmin().addStep(new AddVertexStartStep(traversal, label));
  }

  @Override
  public SocialTraversal<Vertex, Vertex> V(Object... vertexIds) {
    SocialTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.V, vertexIds);
    DefaultSocialTraversal traversal = new DefaultSocialTraversal(clone);
    return (SocialTraversal) traversal.asAdmin().addStep(new GraphStep(traversal, Vertex.class, true, vertexIds));
  }

  @Override
  public SocialTraversal<Edge, Edge> E(Object... edgeIds) {
    SocialTraversalSource clone = this.clone();
    clone.getBytecode().addStep(GraphTraversal.Symbols.E, edgeIds);
    DefaultSocialTraversal traversal = new DefaultSocialTraversal(clone);
    return (SocialTraversal) traversal.asAdmin().addStep(new GraphStep(traversal, Edge.class, true, edgeIds));
  }
}
