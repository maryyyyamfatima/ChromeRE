package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: em1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5018em1 {
    public final /* synthetic */ View a;

    public /* synthetic */ C5018em1(View view) {
        this.a = view;
    }

    public final boolean a(C8799pm1 c8799pm1, int i, Bundle bundle) {
        InterfaceC8223o50 c8566p50;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                c8799pm1.a.b();
                InputContentInfo inputContentInfo = (InputContentInfo) c8799pm1.a.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        }
        ClipDescription d = c8799pm1.a.d();
        InterfaceC8456om1 interfaceC8456om1 = c8799pm1.a;
        ClipData clipData = new ClipData(d, new ClipData.Item(interfaceC8456om1.a()));
        if (i2 >= 31) {
            c8566p50 = new C7879n50(clipData, 2);
        } else {
            c8566p50 = new C8566p50(clipData, 2);
        }
        c8566p50.a(interfaceC8456om1.c());
        c8566p50.setExtras(bundle);
        return Ec4.i(this.a, c8566p50.build()) == null;
    }
}
