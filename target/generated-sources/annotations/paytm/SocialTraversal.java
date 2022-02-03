package paytm;

import java.lang.Integer;
import java.lang.Long;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apache.tinkerpop.gremlin.process.computer.VertexProgram;
import org.apache.tinkerpop.gremlin.process.traversal.Order;
import org.apache.tinkerpop.gremlin.process.traversal.P;
import org.apache.tinkerpop.gremlin.process.traversal.Path;
import org.apache.tinkerpop.gremlin.process.traversal.Pop;
import org.apache.tinkerpop.gremlin.process.traversal.Scope;
import org.apache.tinkerpop.gremlin.process.traversal.Traversal;
import org.apache.tinkerpop.gremlin.process.traversal.Traverser;
import org.apache.tinkerpop.gremlin.process.traversal.step.util.Tree;
import org.apache.tinkerpop.gremlin.process.traversal.traverser.util.TraverserSet;
import org.apache.tinkerpop.gremlin.process.traversal.util.TraversalMetrics;
import org.apache.tinkerpop.gremlin.structure.Column;
import org.apache.tinkerpop.gremlin.structure.Direction;
import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Property;
import org.apache.tinkerpop.gremlin.structure.T;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.apache.tinkerpop.gremlin.structure.VertexProperty;

public interface SocialTraversal<S, E> extends SocialTraversalDsl<S, E> {
  @Override
  default SocialTraversal<S, Vertex> knows(String personName) {
    return (SocialTraversal) SocialTraversalDsl.super.knows(personName);
  }

  @Override
  default <E2 extends Number> SocialTraversal<S, E2> youngestFriendsAge() {
    return (SocialTraversal) SocialTraversalDsl.super.youngestFriendsAge();
  }

  @Override
  default SocialTraversal<S, Long> createdAtLeast(int number) {
    return (SocialTraversal) SocialTraversalDsl.super.createdAtLeast(number);
  }

  @Override
  default SocialTraversal<S, E> person() {
    return (SocialTraversal) SocialTraversalDsl.super.person();
  }

  @Override
  default <E2> SocialTraversal<S, E2> map(Function<Traverser<E>, E2> function) {
    return (SocialTraversal) SocialTraversalDsl.super.map(function);
  }

  @Override
  default <E2> SocialTraversal<S, E2> map(Traversal<?, E2> mapTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.map(mapTraversal);
  }

  @Override
  default <E2> SocialTraversal<S, E2> flatMap(Function<Traverser<E>, Iterator<E2>> function) {
    return (SocialTraversal) SocialTraversalDsl.super.flatMap(function);
  }

  @Override
  default <E2> SocialTraversal<S, E2> flatMap(Traversal<?, E2> flatMapTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.flatMap(flatMapTraversal);
  }

  @Override
  default SocialTraversal<S, Object> id() {
    return (SocialTraversal) SocialTraversalDsl.super.id();
  }

  @Override
  default SocialTraversal<S, String> label() {
    return (SocialTraversal) SocialTraversalDsl.super.label();
  }

  @Override
  default SocialTraversal<S, E> identity() {
    return (SocialTraversal) SocialTraversalDsl.super.identity();
  }

  @Override
  default <E2> SocialTraversal<S, E2> constant(E2 e) {
    return (SocialTraversal) SocialTraversalDsl.super.constant(e);
  }

  @Override
  default SocialTraversal<S, Vertex> V(Object... vertexIdsOrElements) {
    return (SocialTraversal) SocialTraversalDsl.super.V(vertexIdsOrElements);
  }

  @Override
  default SocialTraversal<S, Vertex> to(Direction direction, String... edgeLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.to(direction,edgeLabels);
  }

  @Override
  default SocialTraversal<S, Vertex> out(String... edgeLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.out(edgeLabels);
  }

  @Override
  default SocialTraversal<S, Vertex> in(String... edgeLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.in(edgeLabels);
  }

  @Override
  default SocialTraversal<S, Vertex> both(String... edgeLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.both(edgeLabels);
  }

  @Override
  default SocialTraversal<S, Edge> toE(Direction direction, String... edgeLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.toE(direction,edgeLabels);
  }

  @Override
  default SocialTraversal<S, Edge> outE(String... edgeLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.outE(edgeLabels);
  }

  @Override
  default SocialTraversal<S, Edge> inE(String... edgeLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.inE(edgeLabels);
  }

  @Override
  default SocialTraversal<S, Edge> bothE(String... edgeLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.bothE(edgeLabels);
  }

  @Override
  default SocialTraversal<S, Vertex> toV(Direction direction) {
    return (SocialTraversal) SocialTraversalDsl.super.toV(direction);
  }

  @Override
  default SocialTraversal<S, Vertex> inV() {
    return (SocialTraversal) SocialTraversalDsl.super.inV();
  }

  @Override
  default SocialTraversal<S, Vertex> outV() {
    return (SocialTraversal) SocialTraversalDsl.super.outV();
  }

  @Override
  default SocialTraversal<S, Vertex> bothV() {
    return (SocialTraversal) SocialTraversalDsl.super.bothV();
  }

  @Override
  default SocialTraversal<S, Vertex> otherV() {
    return (SocialTraversal) SocialTraversalDsl.super.otherV();
  }

  @Override
  default SocialTraversal<S, E> order() {
    return (SocialTraversal) SocialTraversalDsl.super.order();
  }

  @Override
  default SocialTraversal<S, E> order(Scope scope) {
    return (SocialTraversal) SocialTraversalDsl.super.order(scope);
  }

  @Override
  default <E2> SocialTraversal<S, ? extends Property<E2>> properties(String... propertyKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.properties(propertyKeys);
  }

  @Override
  default <E2> SocialTraversal<S, E2> values(String... propertyKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.values(propertyKeys);
  }

  @Override
  default <E2> SocialTraversal<S, Map<String, E2>> propertyMap(String... propertyKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.propertyMap(propertyKeys);
  }

  @Override
  default <E2> SocialTraversal<S, Map<String, E2>> valueMap(String... propertyKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.valueMap(propertyKeys);
  }

  @Override
  default <E2> SocialTraversal<S, Map<String, E2>> valueMap(boolean includeTokens,
      String... propertyKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.valueMap(includeTokens,propertyKeys);
  }

  @Override
  default <E2> SocialTraversal<S, E2> mapValues() {
    return (SocialTraversal) SocialTraversalDsl.super.mapValues();
  }

  @Override
  default <E2> SocialTraversal<S, E2> mapKeys() {
    return (SocialTraversal) SocialTraversalDsl.super.mapKeys();
  }

  @Override
  default SocialTraversal<S, String> key() {
    return (SocialTraversal) SocialTraversalDsl.super.key();
  }

  @Override
  default <E2> SocialTraversal<S, E2> value() {
    return (SocialTraversal) SocialTraversalDsl.super.value();
  }

  @Override
  default SocialTraversal<S, Path> path() {
    return (SocialTraversal) SocialTraversalDsl.super.path();
  }

  @Override
  default <E2> SocialTraversal<S, Map<String, E2>> match(Traversal<?, ?>... matchTraversals) {
    return (SocialTraversal) SocialTraversalDsl.super.match(matchTraversals);
  }

  @Override
  default <E2> SocialTraversal<S, E2> sack() {
    return (SocialTraversal) SocialTraversalDsl.super.sack();
  }

  @Override
  default SocialTraversal<S, Integer> loops() {
    return (SocialTraversal) SocialTraversalDsl.super.loops();
  }

  @Override
  default <E2> SocialTraversal<S, Map<String, E2>> project(String projectKey,
      String... otherProjectKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.project(projectKey,otherProjectKeys);
  }

  @Override
  default <E2> SocialTraversal<S, Map<String, E2>> select(Pop pop, String selectKey1,
      String selectKey2, String... otherSelectKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.select(pop,selectKey1,selectKey2,otherSelectKeys);
  }

  @Override
  default <E2> SocialTraversal<S, Map<String, E2>> select(String selectKey1, String selectKey2,
      String... otherSelectKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.select(selectKey1,selectKey2,otherSelectKeys);
  }

  @Override
  default <E2> SocialTraversal<S, E2> select(Pop pop, String selectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.select(pop,selectKey);
  }

  @Override
  default <E2> SocialTraversal<S, E2> select(String selectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.select(selectKey);
  }

  @Override
  default <E2> SocialTraversal<S, Collection<E2>> select(Column column) {
    return (SocialTraversal) SocialTraversalDsl.super.select(column);
  }

  @Override
  default <E2> SocialTraversal<S, E2> unfold() {
    return (SocialTraversal) SocialTraversalDsl.super.unfold();
  }

  @Override
  default SocialTraversal<S, List<E>> fold() {
    return (SocialTraversal) SocialTraversalDsl.super.fold();
  }

  @Override
  default <E2> SocialTraversal<S, E2> fold(E2 seed, BiFunction<E2, E, E2> foldFunction) {
    return (SocialTraversal) SocialTraversalDsl.super.fold(seed,foldFunction);
  }

  @Override
  default SocialTraversal<S, Long> count() {
    return (SocialTraversal) SocialTraversalDsl.super.count();
  }

  @Override
  default SocialTraversal<S, Long> count(Scope scope) {
    return (SocialTraversal) SocialTraversalDsl.super.count(scope);
  }

  @Override
  default <E2 extends Number> SocialTraversal<S, E2> sum() {
    return (SocialTraversal) SocialTraversalDsl.super.sum();
  }

  @Override
  default <E2 extends Number> SocialTraversal<S, E2> sum(Scope scope) {
    return (SocialTraversal) SocialTraversalDsl.super.sum(scope);
  }

  @Override
  default <E2 extends Number> SocialTraversal<S, E2> max() {
    return (SocialTraversal) SocialTraversalDsl.super.max();
  }

  @Override
  default <E2 extends Number> SocialTraversal<S, E2> max(Scope scope) {
    return (SocialTraversal) SocialTraversalDsl.super.max(scope);
  }

  @Override
  default <E2 extends Number> SocialTraversal<S, E2> min() {
    return (SocialTraversal) SocialTraversalDsl.super.min();
  }

  @Override
  default <E2 extends Number> SocialTraversal<S, E2> min(Scope scope) {
    return (SocialTraversal) SocialTraversalDsl.super.min(scope);
  }

  @Override
  default <E2 extends Number> SocialTraversal<S, E2> mean() {
    return (SocialTraversal) SocialTraversalDsl.super.mean();
  }

  @Override
  default <E2 extends Number> SocialTraversal<S, E2> mean(Scope scope) {
    return (SocialTraversal) SocialTraversalDsl.super.mean(scope);
  }

  @Override
  default <K, V> SocialTraversal<S, Map<K, V>> group() {
    return (SocialTraversal) SocialTraversalDsl.super.group();
  }

  @Override
  default <K, V> SocialTraversal<S, Map<K, V>> groupV3d0() {
    return (SocialTraversal) SocialTraversalDsl.super.groupV3d0();
  }

  @Override
  default <K> SocialTraversal<S, Map<K, Long>> groupCount() {
    return (SocialTraversal) SocialTraversalDsl.super.groupCount();
  }

  @Override
  default SocialTraversal<S, Tree> tree() {
    return (SocialTraversal) SocialTraversalDsl.super.tree();
  }

  @Override
  default SocialTraversal<S, Vertex> addV(String vertexLabel) {
    return (SocialTraversal) SocialTraversalDsl.super.addV(vertexLabel);
  }

  @Override
  default SocialTraversal<S, Vertex> addV() {
    return (SocialTraversal) SocialTraversalDsl.super.addV();
  }

  @Override
  default SocialTraversal<S, Vertex> addV(Object... propertyKeyValues) {
    return (SocialTraversal) SocialTraversalDsl.super.addV(propertyKeyValues);
  }

  @Override
  default SocialTraversal<S, Edge> addE(String edgeLabel) {
    return (SocialTraversal) SocialTraversalDsl.super.addE(edgeLabel);
  }

  @Override
  default SocialTraversal<S, E> to(String toStepLabel) {
    return (SocialTraversal) SocialTraversalDsl.super.to(toStepLabel);
  }

  @Override
  default SocialTraversal<S, E> from(String fromStepLabel) {
    return (SocialTraversal) SocialTraversalDsl.super.from(fromStepLabel);
  }

  @Override
  default SocialTraversal<S, E> to(Traversal<E, Vertex> toVertex) {
    return (SocialTraversal) SocialTraversalDsl.super.to(toVertex);
  }

  @Override
  default SocialTraversal<S, E> from(Traversal<E, Vertex> fromVertex) {
    return (SocialTraversal) SocialTraversalDsl.super.from(fromVertex);
  }

  @Override
  default SocialTraversal<S, Edge> addE(Direction direction, String firstVertexKeyOrEdgeLabel,
      String edgeLabelOrSecondVertexKey, Object... propertyKeyValues) {
    return (SocialTraversal) SocialTraversalDsl.super.addE(direction,firstVertexKeyOrEdgeLabel,edgeLabelOrSecondVertexKey,propertyKeyValues);
  }

  @Override
  default SocialTraversal<S, Edge> addOutE(String firstVertexKeyOrEdgeLabel,
      String edgeLabelOrSecondVertexKey, Object... propertyKeyValues) {
    return (SocialTraversal) SocialTraversalDsl.super.addOutE(firstVertexKeyOrEdgeLabel,edgeLabelOrSecondVertexKey,propertyKeyValues);
  }

  @Override
  default SocialTraversal<S, Edge> addInE(String firstVertexKeyOrEdgeLabel,
      String edgeLabelOrSecondVertexKey, Object... propertyKeyValues) {
    return (SocialTraversal) SocialTraversalDsl.super.addInE(firstVertexKeyOrEdgeLabel,edgeLabelOrSecondVertexKey,propertyKeyValues);
  }

  @Override
  default SocialTraversal<S, E> filter(Predicate<Traverser<E>> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.filter(predicate);
  }

  @Override
  default SocialTraversal<S, E> filter(Traversal<?, ?> filterTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.filter(filterTraversal);
  }

  @Override
  default SocialTraversal<S, E> or(Traversal<?, ?>... orTraversals) {
    return (SocialTraversal) SocialTraversalDsl.super.or(orTraversals);
  }

  @Override
  default SocialTraversal<S, E> and(Traversal<?, ?>... andTraversals) {
    return (SocialTraversal) SocialTraversalDsl.super.and(andTraversals);
  }

  @Override
  default SocialTraversal<S, E> inject(E... injections) {
    return (SocialTraversal) SocialTraversalDsl.super.inject(injections);
  }

  @Override
  default SocialTraversal<S, E> dedup(Scope scope, String... dedupLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.dedup(scope,dedupLabels);
  }

  @Override
  default SocialTraversal<S, E> dedup(String... dedupLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.dedup(dedupLabels);
  }

  @Override
  default SocialTraversal<S, E> where(String startKey, P<String> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.where(startKey,predicate);
  }

  @Override
  default SocialTraversal<S, E> where(P<String> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.where(predicate);
  }

  @Override
  default SocialTraversal<S, E> where(Traversal<?, ?> whereTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.where(whereTraversal);
  }

  @Override
  default SocialTraversal<S, E> has(String propertyKey, P<?> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.has(propertyKey,predicate);
  }

  @Override
  default SocialTraversal<S, E> has(T accessor, P<?> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.has(accessor,predicate);
  }

  @Override
  default SocialTraversal<S, E> has(String propertyKey, Object value) {
    return (SocialTraversal) SocialTraversalDsl.super.has(propertyKey,value);
  }

  @Override
  default SocialTraversal<S, E> has(T accessor, Object value) {
    return (SocialTraversal) SocialTraversalDsl.super.has(accessor,value);
  }

  @Override
  default SocialTraversal<S, E> has(String label, String propertyKey, P<?> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.has(label,propertyKey,predicate);
  }

  @Override
  default SocialTraversal<S, E> has(String label, String propertyKey, Object value) {
    return (SocialTraversal) SocialTraversalDsl.super.has(label,propertyKey,value);
  }

  @Override
  default SocialTraversal<S, E> has(T accessor, Traversal<?, ?> propertyTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.has(accessor,propertyTraversal);
  }

  @Override
  default SocialTraversal<S, E> has(String propertyKey, Traversal<?, ?> propertyTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.has(propertyKey,propertyTraversal);
  }

  @Override
  default SocialTraversal<S, E> has(String propertyKey) {
    return (SocialTraversal) SocialTraversalDsl.super.has(propertyKey);
  }

  @Override
  default SocialTraversal<S, E> hasNot(String propertyKey) {
    return (SocialTraversal) SocialTraversalDsl.super.hasNot(propertyKey);
  }

  @Override
  default SocialTraversal<S, E> hasLabel(String label, String... otherLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.hasLabel(label,otherLabels);
  }

  @Override
  default SocialTraversal<S, E> hasLabel(P<String> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.hasLabel(predicate);
  }

  @Override
  default SocialTraversal<S, E> hasId(Object id, Object... otherIds) {
    return (SocialTraversal) SocialTraversalDsl.super.hasId(id,otherIds);
  }

  @Override
  default SocialTraversal<S, E> hasId(P<Object> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.hasId(predicate);
  }

  @Override
  default SocialTraversal<S, E> hasKey(String label, String... otherLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.hasKey(label,otherLabels);
  }

  @Override
  default SocialTraversal<S, E> hasKey(P<String> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.hasKey(predicate);
  }

  @Override
  default SocialTraversal<S, E> hasValue(Object value, Object... otherValues) {
    return (SocialTraversal) SocialTraversalDsl.super.hasValue(value,otherValues);
  }

  @Override
  default SocialTraversal<S, E> hasValue(P<Object> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.hasValue(predicate);
  }

  @Override
  default SocialTraversal<S, E> is(P<E> predicate) {
    return (SocialTraversal) SocialTraversalDsl.super.is(predicate);
  }

  @Override
  default SocialTraversal<S, E> is(Object value) {
    return (SocialTraversal) SocialTraversalDsl.super.is(value);
  }

  @Override
  default SocialTraversal<S, E> not(Traversal<?, ?> notTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.not(notTraversal);
  }

  @Override
  default SocialTraversal<S, E> coin(double probability) {
    return (SocialTraversal) SocialTraversalDsl.super.coin(probability);
  }

  @Override
  default SocialTraversal<S, E> range(long low, long high) {
    return (SocialTraversal) SocialTraversalDsl.super.range(low,high);
  }

  @Override
  default <E2> SocialTraversal<S, E2> range(Scope scope, long low, long high) {
    return (SocialTraversal) SocialTraversalDsl.super.range(scope,low,high);
  }

  @Override
  default SocialTraversal<S, E> limit(long limit) {
    return (SocialTraversal) SocialTraversalDsl.super.limit(limit);
  }

  @Override
  default <E2> SocialTraversal<S, E2> limit(Scope scope, long limit) {
    return (SocialTraversal) SocialTraversalDsl.super.limit(scope,limit);
  }

  @Override
  default SocialTraversal<S, E> tail() {
    return (SocialTraversal) SocialTraversalDsl.super.tail();
  }

  @Override
  default SocialTraversal<S, E> tail(long limit) {
    return (SocialTraversal) SocialTraversalDsl.super.tail(limit);
  }

  @Override
  default <E2> SocialTraversal<S, E2> tail(Scope scope) {
    return (SocialTraversal) SocialTraversalDsl.super.tail(scope);
  }

  @Override
  default <E2> SocialTraversal<S, E2> tail(Scope scope, long limit) {
    return (SocialTraversal) SocialTraversalDsl.super.tail(scope,limit);
  }

  @Override
  default SocialTraversal<S, E> timeLimit(long timeLimit) {
    return (SocialTraversal) SocialTraversalDsl.super.timeLimit(timeLimit);
  }

  @Override
  default SocialTraversal<S, E> simplePath() {
    return (SocialTraversal) SocialTraversalDsl.super.simplePath();
  }

  @Override
  default SocialTraversal<S, E> cyclicPath() {
    return (SocialTraversal) SocialTraversalDsl.super.cyclicPath();
  }

  @Override
  default SocialTraversal<S, E> sample(int amountToSample) {
    return (SocialTraversal) SocialTraversalDsl.super.sample(amountToSample);
  }

  @Override
  default SocialTraversal<S, E> sample(Scope scope, int amountToSample) {
    return (SocialTraversal) SocialTraversalDsl.super.sample(scope,amountToSample);
  }

  @Override
  default SocialTraversal<S, E> drop() {
    return (SocialTraversal) SocialTraversalDsl.super.drop();
  }

  @Override
  default SocialTraversal<S, E> sideEffect(Consumer<Traverser<E>> consumer) {
    return (SocialTraversal) SocialTraversalDsl.super.sideEffect(consumer);
  }

  @Override
  default SocialTraversal<S, E> sideEffect(Traversal<?, ?> sideEffectTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.sideEffect(sideEffectTraversal);
  }

  @Override
  default <E2> SocialTraversal<S, E2> cap(String sideEffectKey, String... sideEffectKeys) {
    return (SocialTraversal) SocialTraversalDsl.super.cap(sideEffectKey,sideEffectKeys);
  }

  @Override
  default SocialTraversal<S, Edge> subgraph(String sideEffectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.subgraph(sideEffectKey);
  }

  @Override
  default SocialTraversal<S, E> aggregate(String sideEffectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.aggregate(sideEffectKey);
  }

  @Override
  default SocialTraversal<S, E> group(String sideEffectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.group(sideEffectKey);
  }

  @Override
  default SocialTraversal<S, E> groupV3d0(String sideEffectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.groupV3d0(sideEffectKey);
  }

  @Override
  default SocialTraversal<S, E> groupCount(String sideEffectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.groupCount(sideEffectKey);
  }

  @Override
  default SocialTraversal<S, E> tree(String sideEffectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.tree(sideEffectKey);
  }

  @Override
  default <V, U> SocialTraversal<S, E> sack(BiFunction<V, U, V> sackOperator) {
    return (SocialTraversal) SocialTraversalDsl.super.sack(sackOperator);
  }

  @Override
  default <V, U> SocialTraversal<S, E> sack(BiFunction<V, U, V> sackOperator,
      String elementPropertyKey) {
    return (SocialTraversal) SocialTraversalDsl.super.sack(sackOperator,elementPropertyKey);
  }

  @Override
  default SocialTraversal<S, E> store(String sideEffectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.store(sideEffectKey);
  }

  @Override
  default SocialTraversal<S, E> profile(String sideEffectKey) {
    return (SocialTraversal) SocialTraversalDsl.super.profile(sideEffectKey);
  }

  @Override
  default SocialTraversal<S, TraversalMetrics> profile() {
    return (SocialTraversal) SocialTraversalDsl.super.profile();
  }

  @Override
  default SocialTraversal<S, E> property(VertexProperty.Cardinality cardinality, Object key,
      Object value, Object... keyValues) {
    return (SocialTraversal) SocialTraversalDsl.super.property(cardinality,key,value,keyValues);
  }

  @Override
  default SocialTraversal<S, E> property(Object key, Object value, Object... keyValues) {
    return (SocialTraversal) SocialTraversalDsl.super.property(key,value,keyValues);
  }

  @Override
  default <M, E2> SocialTraversal<S, E2> branch(Traversal<?, M> branchTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.branch(branchTraversal);
  }

  @Override
  default <M, E2> SocialTraversal<S, E2> branch(Function<Traverser<E>, M> function) {
    return (SocialTraversal) SocialTraversalDsl.super.branch(function);
  }

  @Override
  default <M, E2> SocialTraversal<S, E2> choose(Traversal<?, M> choiceTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.choose(choiceTraversal);
  }

  @Override
  default <E2> SocialTraversal<S, E2> choose(Traversal<?, ?> traversalPredicate,
      Traversal<?, E2> trueChoice, Traversal<?, E2> falseChoice) {
    return (SocialTraversal) SocialTraversalDsl.super.choose(traversalPredicate,trueChoice,falseChoice);
  }

  @Override
  default <E2> SocialTraversal<S, E2> choose(Traversal<?, ?> traversalPredicate,
      Traversal<?, E2> trueChoice) {
    return (SocialTraversal) SocialTraversalDsl.super.choose(traversalPredicate,trueChoice);
  }

  @Override
  default <M, E2> SocialTraversal<S, E2> choose(Function<E, M> choiceFunction) {
    return (SocialTraversal) SocialTraversalDsl.super.choose(choiceFunction);
  }

  @Override
  default <E2> SocialTraversal<S, E2> choose(Predicate<E> choosePredicate,
      Traversal<?, E2> trueChoice, Traversal<?, E2> falseChoice) {
    return (SocialTraversal) SocialTraversalDsl.super.choose(choosePredicate,trueChoice,falseChoice);
  }

  @Override
  default <E2> SocialTraversal<S, E2> choose(Predicate<E> choosePredicate,
      Traversal<?, E2> trueChoice) {
    return (SocialTraversal) SocialTraversalDsl.super.choose(choosePredicate,trueChoice);
  }

  @Override
  default <E2> SocialTraversal<S, E2> optional(Traversal<?, E2> optionalTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.optional(optionalTraversal);
  }

  @Override
  default <E2> SocialTraversal<S, E2> union(Traversal<?, E2>... unionTraversals) {
    return (SocialTraversal) SocialTraversalDsl.super.union(unionTraversals);
  }

  @Override
  default <E2> SocialTraversal<S, E2> coalesce(Traversal<?, E2>... coalesceTraversals) {
    return (SocialTraversal) SocialTraversalDsl.super.coalesce(coalesceTraversals);
  }

  @Override
  default SocialTraversal<S, E> repeat(Traversal<?, E> repeatTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.repeat(repeatTraversal);
  }

  @Override
  default SocialTraversal<S, E> emit(Traversal<?, ?> emitTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.emit(emitTraversal);
  }

  @Override
  default SocialTraversal<S, E> emit(Predicate<Traverser<E>> emitPredicate) {
    return (SocialTraversal) SocialTraversalDsl.super.emit(emitPredicate);
  }

  @Override
  default SocialTraversal<S, E> emit() {
    return (SocialTraversal) SocialTraversalDsl.super.emit();
  }

  @Override
  default SocialTraversal<S, E> until(Traversal<?, ?> untilTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.until(untilTraversal);
  }

  @Override
  default SocialTraversal<S, E> until(Predicate<Traverser<E>> untilPredicate) {
    return (SocialTraversal) SocialTraversalDsl.super.until(untilPredicate);
  }

  @Override
  default SocialTraversal<S, E> times(int maxLoops) {
    return (SocialTraversal) SocialTraversalDsl.super.times(maxLoops);
  }

  @Override
  default <E2> SocialTraversal<S, E2> local(Traversal<?, E2> localTraversal) {
    return (SocialTraversal) SocialTraversalDsl.super.local(localTraversal);
  }

  @Override
  default SocialTraversal<S, E> pageRank() {
    return (SocialTraversal) SocialTraversalDsl.super.pageRank();
  }

  @Override
  default SocialTraversal<S, E> pageRank(double alpha) {
    return (SocialTraversal) SocialTraversalDsl.super.pageRank(alpha);
  }

  @Override
  default SocialTraversal<S, E> peerPressure() {
    return (SocialTraversal) SocialTraversalDsl.super.peerPressure();
  }

  @Override
  default SocialTraversal<S, E> program(VertexProgram<?> vertexProgram) {
    return (SocialTraversal) SocialTraversalDsl.super.program(vertexProgram);
  }

  @Override
  default SocialTraversal<S, E> as(String stepLabel, String... stepLabels) {
    return (SocialTraversal) SocialTraversalDsl.super.as(stepLabel,stepLabels);
  }

  @Override
  default SocialTraversal<S, E> barrier() {
    return (SocialTraversal) SocialTraversalDsl.super.barrier();
  }

  @Override
  default SocialTraversal<S, E> barrier(int maxBarrierSize) {
    return (SocialTraversal) SocialTraversalDsl.super.barrier(maxBarrierSize);
  }

  @Override
  default SocialTraversal<S, E> barrier(Consumer<TraverserSet<Object>> barrierConsumer) {
    return (SocialTraversal) SocialTraversalDsl.super.barrier(barrierConsumer);
  }

  @Override
  default SocialTraversal<S, E> by() {
    return (SocialTraversal) SocialTraversalDsl.super.by();
  }

  @Override
  default SocialTraversal<S, E> by(Traversal<?, ?> traversal) {
    return (SocialTraversal) SocialTraversalDsl.super.by(traversal);
  }

  @Override
  default SocialTraversal<S, E> by(T token) {
    return (SocialTraversal) SocialTraversalDsl.super.by(token);
  }

  @Override
  default SocialTraversal<S, E> by(String key) {
    return (SocialTraversal) SocialTraversalDsl.super.by(key);
  }

  @Override
  default <V> SocialTraversal<S, E> by(Function<V, Object> function) {
    return (SocialTraversal) SocialTraversalDsl.super.by(function);
  }

  @Override
  default <V> SocialTraversal<S, E> by(Traversal<?, ?> traversal, Comparator<V> comparator) {
    return (SocialTraversal) SocialTraversalDsl.super.by(traversal,comparator);
  }

  @Override
  default SocialTraversal<S, E> by(Comparator<E> comparator) {
    return (SocialTraversal) SocialTraversalDsl.super.by(comparator);
  }

  @Override
  default SocialTraversal<S, E> by(Order order) {
    return (SocialTraversal) SocialTraversalDsl.super.by(order);
  }

  @Override
  default <V> SocialTraversal<S, E> by(String key, Comparator<V> comparator) {
    return (SocialTraversal) SocialTraversalDsl.super.by(key,comparator);
  }

  @Override
  default <U> SocialTraversal<S, E> by(Function<U, Object> function, Comparator comparator) {
    return (SocialTraversal) SocialTraversalDsl.super.by(function,comparator);
  }

  @Override
  default <M, E2> SocialTraversal<S, E> option(M pickToken, Traversal<E, E2> traversalOption) {
    return (SocialTraversal) SocialTraversalDsl.super.option(pickToken,traversalOption);
  }

  @Override
  default <E2> SocialTraversal<S, E> option(Traversal<E, E2> traversalOption) {
    return (SocialTraversal) SocialTraversalDsl.super.option(traversalOption);
  }

  @Override
  default SocialTraversal<S, E> iterate() {
    SocialTraversalDsl.super.iterate();
    return this;
  }
}
