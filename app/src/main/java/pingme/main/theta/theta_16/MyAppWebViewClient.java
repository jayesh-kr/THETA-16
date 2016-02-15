package pingme.main.theta.theta_16;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by PingMe on 2/6/2016.
 */
public class MyAppWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view,String url)
    {
        if (Uri.parse(url).getHost().endsWith(("theta16.org")))
        {
            return false;
        }

        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;

    }



}
