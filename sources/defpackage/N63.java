package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class N63 {
    public static void d(int i) {
        EI2.h(i, 3, "Sharing.AnyShareStarted");
    }

    public static void a(WindowAndroid windowAndroid, Intent intent, M63 m63) {
        if (m63 != null) {
            windowAndroid.B(intent, m63, null);
        } else {
            ((Activity) windowAndroid.k().get()).startActivity(intent);
        }
    }

    public static Intent c(C6862k73 c6862k73) {
        ArrayList arrayList = c6862k73.g;
        boolean z = arrayList != null;
        boolean z2 = z && arrayList.size() > 1;
        Intent intent = new Intent(z2 ? "android.intent.action.SEND_MULTIPLE" : "android.intent.action.SEND");
        intent.addFlags(319291392);
        intent.putExtra("org.chromium.chrome.extra.TASK_ID", ((Activity) c6862k73.a.k().get()).getTaskId());
        Uri uri = c6862k73.j;
        if (uri != null) {
            intent.addFlags(1);
            intent.setClipData(ClipData.newRawUri("", uri));
            intent.putExtra("share_screenshot_as_stream", uri);
        }
        Uri uri2 = c6862k73.i;
        String str = c6862k73.b;
        if (uri2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str);
            intent.addFlags(134217728);
            intent.addFlags(1);
            intent.putExtra("android.intent.extra.STREAM", uri2);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setType("multipart/related");
        } else {
            if (!TextUtils.equals(c6862k73.b(), str)) {
                intent.putExtra("android.intent.extra.SUBJECT", str);
            }
            intent.putExtra("android.intent.extra.TEXT", c6862k73.b());
            if (z) {
                intent.setType(c6862k73.f);
                intent.addFlags(1);
                ArrayList<String> arrayList2 = c6862k73.h;
                boolean z3 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
                ArrayList<? extends Parcelable> arrayList3 = c6862k73.g;
                if (z2) {
                    intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
                    if (z3) {
                        intent.putStringArrayListExtra("android.intent.extra.STREAM_ALT_TEXT", arrayList2);
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", (Parcelable) arrayList3.get(0));
                    if (z3) {
                        intent.putExtra("android.intent.extra.STREAM_ALT_TEXT", arrayList2.get(0));
                    }
                }
            } else {
                intent.setType("text/plain");
            }
        }
        return intent;
    }

    public static Intent b() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(524288);
        intent.putExtra("android.intent.extra.SUBJECT", "");
        intent.putExtra("android.intent.extra.TEXT", "");
        intent.setType("text/plain");
        return intent;
    }
}
