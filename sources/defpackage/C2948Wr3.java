package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wr3 */
/* loaded from: classes.dex */
public final class C2948Wr3 extends ClickableSpan {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String g;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C5364fm3 c5364fm3 = new C5364fm3();
        Context context = this.a;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            Integer valueOf = Integer.valueOf(Color.parseColor("#eeeeee") | (-16777216));
            Intent intent = new Intent("android.intent.action.VIEW");
            Bundle bundle = new Bundle();
            if (valueOf != null) {
                bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
            }
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle2 = new Bundle();
                bundle2.putBinder("android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle2);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent.putExtras(new Bundle());
            intent.putExtras(bundle);
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            try {
                intent.setData(Uri.parse("https://www.google.com/policies/terms/"));
                Object obj = Y50.a;
                context.startActivity(intent, null);
            } catch (ActivityNotFoundException unused) {
                Log.e("SurveyUtils", "No app found to open URL: https://www.google.com/policies/terms/");
            }
        } else {
            Toast.makeText(context, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140ab2), 0).show();
        }
        Context context2 = this.a;
        String str = this.g;
        if (OP0.c(C10747vT.a(OP0.b))) {
            C4931eX1 a = C4931eX1.a();
            C3771b74 c3771b74 = (C3771b74) C4801e74.l.j();
            if (c3771b74.h) {
                c3771b74.l();
                c3771b74.h = false;
            }
            C4801e74 c4801e74 = (C4801e74) c3771b74.g;
            c4801e74.getClass();
            c4801e74.j = AbstractC4114c74.a(1);
            if (c3771b74.h) {
                c3771b74.l();
                c3771b74.h = false;
            }
            C4801e74 c4801e742 = (C4801e74) c3771b74.g;
            c4801e742.getClass();
            c4801e742.k = AbstractC4458d74.a(4);
            a.e((C4801e74) c3771b74.j(), c5364fm3.b(), c5364fm3.a(), context2, str);
        }
    }

    public C2948Wr3(Context context, String str) {
        this.a = context;
        this.g = str;
    }
}
