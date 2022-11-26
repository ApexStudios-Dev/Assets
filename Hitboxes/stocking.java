Stream.of(
Block.box(4, 12, 13, 12, 15, 16),
Block.box(5, 1, 13.5, 11, 12, 15.5),
Block.box(11, 1, 13.5, 14, 6, 15.5)
).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();