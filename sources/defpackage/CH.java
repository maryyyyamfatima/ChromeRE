package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class CH implements UR1 {
    public static final List e = Arrays.asList("custom_controller_scoped", "tab_and_origin_scoped", "origin_scoped", "page_scoped");
    public static final List f = Arrays.asList("video_out", "audio_out", "video_in", "audio_in", "multizone_group");
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.CH e(java.lang.String r12) {
        /*
            java.lang.String r0 = "cast:"
            boolean r0 = r12.startsWith(r0)
            java.util.List r1 = defpackage.CH.f
            java.lang.String r2 = ","
            java.util.List r3 = defpackage.CH.e
            r4 = 0
            r5 = 0
            if (r0 == 0) goto L5a
            r0 = 5
            java.lang.String r0 = r12.substring(r0)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r6 = r0.getPath()
            if (r6 != 0) goto L21
            goto Lda
        L21:
            java.lang.String r7 = "clientId"
            java.lang.String r7 = r0.getQueryParameter(r7)
            java.lang.String r8 = "autoJoinPolicy"
            java.lang.String r8 = r0.getQueryParameter(r8)
            if (r8 == 0) goto L37
            boolean r3 = r3.contains(r8)
            if (r3 != 0) goto L37
            goto Lda
        L37:
            java.lang.String r3 = "capabilities"
            java.lang.String r0 = r0.getQueryParameter(r3)
            if (r0 == 0) goto L53
            java.lang.String[] r0 = r0.split(r2)
            int r2 = r0.length
        L44:
            if (r4 >= r2) goto L53
            r3 = r0[r4]
            boolean r3 = r1.contains(r3)
            if (r3 != 0) goto L50
            goto Lda
        L50:
            int r4 = r4 + 1
            goto L44
        L53:
            CH r5 = new CH
            r5.<init>(r12, r6, r7, r8)
            goto Lda
        L5a:
            android.net.Uri r0 = android.net.Uri.parse(r12)
            java.lang.String r0 = r0.getFragment()
            if (r0 != 0) goto L66
            goto Lda
        L66:
            java.lang.String r6 = "/"
            java.lang.String[] r0 = r0.split(r6)
            java.lang.String r6 = "__castAppId__"
            java.lang.String r6 = d(r6, r0)
            if (r6 != 0) goto L76
            goto Lda
        L76:
            java.lang.String r7 = "("
            int r8 = r6.indexOf(r7)
            r9 = -1
            if (r8 == r9) goto Lc0
            java.lang.String r9 = r6.substring(r8)
            int r10 = r9.length()
            r11 = 2
            if (r10 >= r11) goto L8b
            goto Lb8
        L8b:
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto Lb8
            java.lang.String r7 = ")"
            boolean r7 = r9.endsWith(r7)
            if (r7 != 0) goto L9a
            goto Lb8
        L9a:
            int r7 = r9.length()
            r10 = 1
            int r7 = r7 - r10
            java.lang.String r7 = r9.substring(r10, r7)
            java.lang.String[] r2 = r7.split(r2)
            int r7 = r2.length
            r9 = r4
        Laa:
            if (r9 >= r7) goto Lb9
            r10 = r2[r9]
            boolean r10 = r1.contains(r10)
            if (r10 != 0) goto Lb5
            goto Lb8
        Lb5:
            int r9 = r9 + 1
            goto Laa
        Lb8:
            r2 = r5
        Lb9:
            if (r2 != 0) goto Lbc
            goto Lda
        Lbc:
            java.lang.String r6 = r6.substring(r4, r8)
        Lc0:
            java.lang.String r1 = "__castClientId__"
            java.lang.String r1 = d(r1, r0)
            java.lang.String r2 = "__castAutoJoinPolicy__"
            java.lang.String r0 = d(r2, r0)
            if (r0 == 0) goto Ld5
            boolean r2 = r3.contains(r0)
            if (r2 != 0) goto Ld5
            goto Lda
        Ld5:
            CH r5 = new CH
            r5.<init>(r12, r6, r1, r0)
        Lda:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CH.e(java.lang.String):CH");
    }

    @Override // defpackage.UR1
    public final C6614jQ1 b() {
        try {
            String b = AH.b(this.b);
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
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // defpackage.UR1
    public final String a() {
        return this.b;
    }

    @Override // defpackage.UR1
    public final String c() {
        return this.a;
    }

    public CH(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4 == null ? "tab_and_origin_scoped" : str4;
    }

    public static String d(String str, String[] strArr) {
        String concat = str.concat("=");
        for (String str2 : strArr) {
            if (str2.startsWith(concat)) {
                return str2.substring(concat.length());
            }
        }
        return null;
    }
}
