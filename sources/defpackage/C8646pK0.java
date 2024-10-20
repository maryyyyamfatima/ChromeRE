package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8646pK0 extends C9097qe4 {
    public final Activity l;

    public C8646pK0(Activity activity, ViewGroup viewGroup, QZ3 qz3, int i, int i2) {
        super(viewGroup, qz3, i, i2);
        this.l = activity;
    }

    public static void d(Activity activity, ViewGroup viewGroup, QZ3 qz3) {
        new C8646pK0(activity, viewGroup, qz3, activity.getResources().getDimensionPixelSize(R.dimen.f29790_resource_name_obfuscated_res_0x7f080134), activity.getResources().getDimensionPixelSize(R.dimen.f37620_resource_name_obfuscated_res_0x7f080619)).b();
    }

    @Override // defpackage.C9097qe4
    public final int c() {
        View findViewById;
        int c = super.c();
        QZ3 qz3 = this.j;
        if (qz3.c.getResources().getConfiguration().orientation != 2) {
            return c;
        }
        Activity activity = this.l;
        if (AbstractC9771sd.f(activity)) {
            return c;
        }
        float f = qz3.c.getResources().getDisplayMetrics().density;
        float f2 = r1.getConfiguration().screenWidthDp * f;
        float f3 = r1.getConfiguration().screenHeightDp * f;
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(new Rect());
        float f4 = f3 - r3.top;
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(android.R.id.content);
        int i = 0;
        if (viewGroup != null && (findViewById = viewGroup.findViewById(R.id.toolbar_container)) != null) {
            i = findViewById.getHeight();
        }
        return Math.max((int) ((f2 - ((f4 - i) * 1.778f)) / 2.0f), c);
    }
}
