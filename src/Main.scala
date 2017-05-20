import java.net.{URL, HttpURLConnection}
import java.util.zip.GZIPInputStream
/**
  * Created by kirin on 2017/05/20.
  */
object Main extends App {

  val url = new URL("...")
  // インスタンスの取得
  val connection: HttpURLConnection = url.openConnection.asInstanceOf[HttpURLConnection]

  // リクエストヘッダの処理
  // Accept-Encoding: gzip
  connection.setRequestProperty("Accept-Encogin","gzip")
  connection.getHeaderField("Content-Encoding")
  // gzipで圧縮されていれば以下のヘッダが返される
  // Content-Encoding: gzip

  // インスタンスからHTTP接続
  connection.connect
  // HTTPステータスの取得
  val httpStatus = connection.getResponseCode
  // レスポンスヘッダの処理
  if(httpStatus == 200)
  // 接続に成功したらレスポンスデータを保存
    0
  else
  // 200以外は何もしない
    0
  // TODO: レスポンスヘッダを部分的に保存
  //
}
