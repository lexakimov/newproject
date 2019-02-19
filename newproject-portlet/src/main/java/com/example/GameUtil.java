package com.example;

public class GameUtil {

	public static void moveLeft(Tile[][] matrix) {
		for (int i = 0; i < 4; i++) {
			boolean isLastUpdated = false;
			for (int j = 0; j < 4; j++) {

				if (matrix[i][j] == null) {
					for (int k = j + 1; k <= 3; k++) {
						if (matrix[i][k] != null) {
							matrix[i][j] = matrix[i][k];
							matrix[i][j].setCol(j);
							matrix[i][k] = null;
							isLastUpdated = false;
							break;
						}
					}
				}

				if (matrix[i][j] != null) {
					for (int k = j + 1; k <= 3; k++) {
						if (matrix[i][k] != null) {
							if (matrix[i][k].getValue() == matrix[i][j].getValue() && !isLastUpdated) {
								matrix[i][j] = new Tile(matrix[i][j].getValue() * 2, i, j);
								isLastUpdated = true;
								matrix[i][k] = null;
							}
							break;
						}

					}
				}
			}
		}
	}

	public static void moveRight(Tile[][] matrix) {
		for (int i = 0; i < 4; i++) {
			boolean isLastUpdated = false;
			for (int j = 3; j >= 0; j--) {
				if (matrix[i][j] == null) {
					for (int k = j - 1; k >= 0; k--) {
						if (matrix[i][k] != null) {
							matrix[i][j] = matrix[i][k];
							matrix[i][j].setCol(j);
							matrix[i][k] = null;
							isLastUpdated = false;
							break;
						}
					}
				}

				if (matrix[i][j] != null) {
					for (int k = j - 1; k >= 0; k--) {
						if (matrix[i][k] != null) {
							if (matrix[i][k].getValue() == matrix[i][j].getValue() && !isLastUpdated) {
								matrix[i][j] = new Tile(matrix[i][j].getValue() * 2, i, j);
								isLastUpdated = true;
								matrix[i][k] = null;
							}
							break;
						}

					}
				}
			}
		}
	}

	public static void moveUp(Tile[][] matrix) {
		for (int i = 0; i < 4; i++) {
			boolean isLastUpdated = false;
			for (int j = 0; j < 4; j++) {

				if (matrix[j][i] == null) {
					for (int k = j + 1; k <= 3; k++) {
						if (matrix[k][i] != null) {
							matrix[j][i] = matrix[k][i];
							matrix[j][i].setRow(j);
							matrix[k][i] = null;
							isLastUpdated = false;
							break;
						}
					}
				}

				if (matrix[j][i] != null) {
					for (int k = j + 1; k <= 3; k++) {
						if (matrix[k][i] != null) {
							if (matrix[k][i].getValue() == matrix[j][i].getValue() && !isLastUpdated) {
								matrix[j][i] = new Tile(matrix[j][i].getValue() * 2, j, i);
								isLastUpdated = true;
								matrix[k][i] = null;
							}
							break;
						}

					}
				}
			}
		}
	}

	public static void moveDown(Tile[][] matrix) {
		for (int i = 0; i < 4; i++) {
			boolean isLastUpdated = false;
			for (int j = 3; j >= 0; j--) {

				if (matrix[j][i] == null) {
					for (int k = j - 1; k >= 0; k--) {
						if (matrix[k][i] != null) {
							matrix[j][i] = matrix[k][i];
							matrix[j][i].setRow(j);
							matrix[k][i] = null;
							isLastUpdated = false;
							break;
						}
					}
				}

				if (matrix[j][i] != null) {
					for (int k = j - 1; k >= 0; k--) {
						if (matrix[k][i] != null) {
							if (matrix[k][i].getValue() == matrix[j][i].getValue() && !isLastUpdated) {
								matrix[j][i] = new Tile(matrix[j][i].getValue() * 2, j, i);
								isLastUpdated = true;
								matrix[k][i] = null;
							}
							break;
						}

					}
				}
			}
		}
	}

}
