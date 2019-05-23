package interpreter;

import interpreter.antlrparser.MiniSqlParser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.util.Arrays;

class ParseTreeDisplayer {
    private ParseTree tree;
    private MiniSqlParser parser;

    ParseTreeDisplayer(ParseTree tree, MiniSqlParser parser) {
        this.tree = tree;
        this.parser = parser;
    }

    void display() {
        SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("ANTLR Parse Tree");
                JPanel panel = new JPanel();
                TreeViewer viewer = new TreeViewer(Arrays.asList(
                        parser.getRuleNames()),tree);
                viewer.setScale(1);
                panel.add(viewer);
                frame.add(panel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1000,1000);
                frame.setVisible(true);
            }
        );
    }
}
