package defpackage;

import android.app.Activity;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.chrome.browser.content_creation.reactions.LightweightReactionsProgressDialog;
import org.chromium.components.browser_ui.widget.MaterialProgressBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wB1 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC11002wB1 implements Runnable {
    public final /* synthetic */ LightweightReactionsProgressDialog a;
    public final /* synthetic */ int g;

    public /* synthetic */ RunnableC11002wB1(LightweightReactionsProgressDialog lightweightReactionsProgressDialog, int i) {
        this.a = lightweightReactionsProgressDialog;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LightweightReactionsProgressDialog lightweightReactionsProgressDialog = this.a;
        TextView textView = lightweightReactionsProgressDialog.s0;
        Activity activity = lightweightReactionsProgressDialog.getActivity();
        int i = this.g;
        textView.setText(activity.getString(R.string.0_resource_name_obfuscated_res_0x7f1405b7, Integer.valueOf(i)));
        MaterialProgressBar materialProgressBar = lightweightReactionsProgressDialog.r0;
        materialProgressBar.getClass();
        materialProgressBar.j = Math.max(0, Math.min(100, i));
        materialProgressBar.postInvalidateOnAnimation();
    }
}
