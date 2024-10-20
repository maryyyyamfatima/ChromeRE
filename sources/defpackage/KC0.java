package defpackage;

import android.os.Handler;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid;
import org.chromium.content_public.browser.WebContents;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KC0 extends WebContentsDelegateAndroid {
    public final /* synthetic */ LC0 a;

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getTopControlsHeight() {
        return this.a.c;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void loadingStateChanged(boolean z) {
        LC0 lc0 = this.a;
        WebContents webContents = lc0.d;
        if (webContents != null && webContents.e()) {
            PC0 pc0 = lc0.e;
            if (pc0 == null) {
                return;
            }
            ((ProgressBar) pc0.l.findViewById(R.id.progress_bar)).setProgress(Math.round(0.0f));
            ((ProgressBar) lc0.e.l.findViewById(R.id.progress_bar)).setVisibility(0);
            return;
        }
        new Handler().postDelayed(new Runnable() { // from class: JC0
            @Override // java.lang.Runnable
            public final void run() {
                PC0 pc02 = KC0.this.a.e;
                if (pc02 != null) {
                    ((ProgressBar) pc02.l.findViewById(R.id.progress_bar)).setVisibility(8);
                }
            }
        }, 64L);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void openNewTab(GURL gurl, String str, ResourceRequestBody resourceRequestBody, int i, boolean z) {
        this.a.a(gurl);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean shouldCreateWebContents(GURL gurl) {
        this.a.a(gurl);
        return false;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void visibleSSLStateChanged() {
        int i;
        LC0 lc0 = this.a;
        if (lc0.e == null) {
            return;
        }
        int a = AbstractC6832k23.a(lc0.d);
        PC0 pc0 = lc0.e;
        if (a != 0) {
            if (a == 3 || a == 4) {
                i = R.drawable.0_resource_name_obfuscated_res_0x7f0903f0;
            } else if (a == 5) {
                i = R.drawable.0_resource_name_obfuscated_res_0x7f0903f3;
            } else if (a != 6) {
                i = 0;
            }
            ((ImageView) pc0.l.findViewById(R.id.security_icon)).setImageResource(i);
            ((TextView) lc0.e.l.findViewById(R.id.origin)).setText(AbstractC10615v34.b(1, lc0.d.u()));
        }
        i = R.drawable.0_resource_name_obfuscated_res_0x7f0903f2;
        ((ImageView) pc0.l.findViewById(R.id.security_icon)).setImageResource(i);
        ((TextView) lc0.e.l.findViewById(R.id.origin)).setText(AbstractC10615v34.b(1, lc0.d.u()));
    }

    public KC0(LC0 lc0) {
        this.a = lc0;
    }
}
