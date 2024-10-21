package org.example.day06.mini;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

    public class MiniMine extends JFrame {
        private static final int TILE_SIZE = 32;       // 타일 크기
        private static final int GRID_WIDTH = 20;      // 가로 타일 개수
        private static final int GRID_HEIGHT = 15;     // 세로 타일 개수
        private TileType[][] grid;                     // 타일 타입 배열

        // 타일 타입 열거형 정의
        private enum TileType {
            EMPTY, GRASS, DIRT, STONE
        }

        public MiniMine() {
            setTitle("Mini Minecraft");
            setSize(GRID_WIDTH * TILE_SIZE, GRID_HEIGHT * TILE_SIZE);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            grid = new TileType[GRID_WIDTH][GRID_HEIGHT]; // 그리드 초기화
            initializeGrid();

            // 마우스 클릭 이벤트 핸들러
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int x = e.getX() / TILE_SIZE;
                    int y = e.getY() / TILE_SIZE;

                    if (SwingUtilities.isLeftMouseButton(e)) {
                        placeTile(x, y, TileType.GRASS);  // 좌클릭 시 잔디 타일 배치
                    } else if (SwingUtilities.isRightMouseButton(e)) {
                        placeTile(x, y, TileType.EMPTY);  // 우클릭 시 타일 제거
                    }
                    repaint();
                }
            });
        }

        // 그리드 초기화 메서드 (빈 타일로 초기화)
        private void initializeGrid() {
            for (int x = 0; x < GRID_WIDTH; x++) {
                for (int y = 0; y < GRID_HEIGHT; y++) {
                    grid[x][y] = TileType.EMPTY;
                }
            }
        }

        // 특정 위치에 타일 배치 메서드
        private void placeTile(int x, int y, TileType type) {
            if (x >= 0 && x < GRID_WIDTH && y >= 0 && y < GRID_HEIGHT) {
                grid[x][y] = type;
            }
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (int x = 0; x < GRID_WIDTH; x++) {
                for (int y = 0; y < GRID_HEIGHT; y++) {
                    drawTile(g, x, y, grid[x][y]);
                }
            }
        }

        // 타일 그리기 메서드
        private void drawTile(Graphics g, int x, int y, TileType type) {
            Color color;
            switch (type) {
                case GRASS: color = new Color(34, 139, 34); break;
                case DIRT: color = new Color(139, 69, 19); break;
                case STONE: color = Color.GRAY; break;
                default: color = Color.WHITE; break;
            }
            g.setColor(color);
            g.fillRect(x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE);

            g.setColor(Color.BLACK); // 타일 경계선을 검은색으로 표시
            g.drawRect(x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                MiniMine game = new MiniMine();
                game.setVisible(true);
            });
        }

}
