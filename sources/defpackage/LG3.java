package defpackage;

import J.N;
import android.app.Activity;
import android.content.Intent;
import com.android.chrome.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes6.dex */
public final class LG3 implements JG3 {
    @Override // defpackage.JG3
    public final void a(Activity activity, Intent intent) {
        int i = intent.getExtras().getInt("test_case");
        if (i == 0) {
            b(0, activity, true);
            return;
        }
        if (i == 1) {
            b(1, activity, N.MZv_$ptE() == 123);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new RuntimeException("Unknown test case " + i);
            }
            b(3, activity, N.M_vJeknC().equals("Hello, World!"));
            return;
        }
        InputStream openRawResource = activity.getResources().openRawResource(R.raw.f62800_resource_name_obfuscated_res_0x7f130003);
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                int read = openRawResource.read();
                if (read == -1) {
                    break;
                } else {
                    sb.append((char) read);
                }
            } catch (IOException e) {
                AbstractC4851eH1.a("TestDummyImpl", "Failed to load resource: %s", e);
            }
        }
        r0 = sb.toString().equals("hello world");
        b(2, activity, r0);
    }

    public static void b(int i, Activity activity, boolean z) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = z ? "pass" : "fail";
        String format = String.format(locale, "Test Case %d: %s", objArr);
        C5490g8 c5490g8 = new C5490g8(activity);
        C4115c8 c4115c8 = c5490g8.a;
        c4115c8.d = "Test Dummy Result";
        c4115c8.f = format;
        c4115c8.k = true;
        c5490g8.a().show();
        AbstractC4851eH1.d("TestDummyImpl", format, new Object[0]);
    }
}
