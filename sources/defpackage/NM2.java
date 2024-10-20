package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class NM2 implements UR1 {
    public static String c;
    public final String a;
    public final String b;

    public static NM2 d(String str) {
        if (!str.startsWith("remote-playback://")) {
            return null;
        }
        try {
            return new NM2(str, new String(Base64.decode(str.substring(18), 8), "UTF-8"));
        } catch (UnsupportedEncodingException | IllegalArgumentException e) {
            AbstractC4851eH1.a("MediaRemoting", "Couldn't parse the source id.", e);
            return null;
        }
    }

    @Override // defpackage.UR1
    public final C6614jQ1 b() {
        String b = AH.b(a());
        if (b == null) {
            throw new IllegalArgumentException("category must not be null");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (!arrayList.contains(b)) {
            arrayList.add(b);
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", arrayList);
        return new C6614jQ1(bundle, arrayList);
    }

    @Override // defpackage.UR1
    public final String a() {
        String str;
        if (c == null) {
            try {
                Context context = V60.a;
                str = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("org.chromium.content.browser.REMOTE_PLAYBACK_APP_ID");
            } catch (Exception unused) {
                str = null;
            }
            if (str == null || str.isEmpty()) {
                str = "CC1AD845";
            }
            c = str;
        }
        return c;
    }

    @Override // defpackage.UR1
    public final String c() {
        return this.a;
    }

    public NM2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
