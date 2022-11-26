Stream.of(
Block.box(1.5, 0, 4.5, 6.5, 5, 9.5),
Block.box(7.5, 0, 8.5, 12.5, 5, 13.5),
Block.box(8.5, 0, 1.5, 13.5, 5, 6.5)
).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();