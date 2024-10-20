package defpackage;

import android.app.Activity;
import android.text.style.ClickableSpan;
import android.view.View;
import com.android.chrome.R;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gk2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5695gk2 extends ClickableSpan {
    public final /* synthetic */ Activity a;

    public C5695gk2(Activity activity) {
        this.a = activity;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C12008z71 a = C12008z71.a();
        Activity activity = this.a;
        a.d(activity, activity.getString(R.string.f74290_resource_name_obfuscated_res_0x7f1404e5), null, Profile.d());
    }
}
