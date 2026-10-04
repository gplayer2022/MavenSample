package io.github.gplayer2022;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
	public static void main(String[] args) throws IOException {
		// MavenSample\target\site を作成する
		Path outputDirectory = Path.of("target", "site");

		Files.createDirectories(outputDirectory);

		String html = """
				<!DOCTYPE html>
				<html lang="ja">
				<head>
				    <meta charset="UTF-8">
				    <title>Maven Sample</title>
				</head>
				<body>
				    <h1>Hello from Maven!</h1>
				    <p>このページは Java プログラムによって生成されました。</p>
				</body>
				</html>
				""";
		// \target\site\index.html を指定
		Path outputFile = outputDirectory.resolve("index.html");
		// ファイルとして書き出す
		Files.writeString(outputFile, html);

		System.out.println("HTML generated: " + outputFile);
	}
}
