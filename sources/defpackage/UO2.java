package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UO2 implements RO2 {
    public static final C8752pe2 b = new C8752pe2("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, C8752pe2.e);
    public final Context a;

    @Override // defpackage.RO2
    public final boolean a(Object obj, C0543Ee2 c0543Ee2) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    @Override // defpackage.RO2
    public final /* bridge */ /* synthetic */ JO2 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        return c((Uri) obj, c0543Ee2);
    }

    public UO2(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.JO2 c(android.net.Uri r10, defpackage.C0543Ee2 r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getAuthority()
            android.content.Context r1 = r9.a
            java.lang.String r2 = r1.getPackageName()
            boolean r2 = r0.equals(r2)
            r3 = 0
            if (r2 == 0) goto L12
            goto L22
        L12:
            android.content.Context r2 = r1.createPackageContext(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L17
            goto L23
        L17:
            r2 = move-exception
            java.lang.String r4 = r1.getPackageName()
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto Lcb
        L22:
            r2 = r1
        L23:
            java.util.List r4 = r10.getPathSegments()
            int r5 = r4.size()
            r6 = 2
            r7 = 1
            if (r5 != r6) goto L6a
            java.util.List r4 = r10.getPathSegments()
            java.lang.String r5 = r10.getAuthority()
            java.lang.Object r6 = r4.get(r3)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r4.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            android.content.res.Resources r8 = r2.getResources()
            int r5 = r8.getIdentifier(r4, r6, r5)
            if (r5 != 0) goto L57
            android.content.res.Resources r5 = android.content.res.Resources.getSystem()
            java.lang.String r8 = "android"
            int r5 = r5.getIdentifier(r4, r6, r8)
        L57:
            if (r5 == 0) goto L5a
            goto L80
        L5a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r0 = "Failed to find resource id for: "
            java.lang.String r10 = r0.concat(r10)
            r11.<init>(r10)
            throw r11
        L6a:
            int r4 = r4.size()
            java.lang.String r5 = "Unrecognized Uri format: "
            if (r4 != r7) goto Lbd
            java.util.List r4 = r10.getPathSegments()
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.NumberFormatException -> Lae
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.NumberFormatException -> Lae
            int r5 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> Lae
        L80:
            pe2 r10 = defpackage.UO2.b
            java.lang.Object r10 = r11.c(r10)
            android.content.res.Resources$Theme r10 = (android.content.res.Resources.Theme) r10
            java.lang.String r11 = r2.getPackageName()
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L94
            if (r10 != 0) goto L95
        L94:
            r3 = r7
        L95:
            java.lang.String r11 = "Can't get a theme from another package"
            defpackage.AbstractC6464iy2.a(r11, r3)
            r11 = 0
            if (r10 != 0) goto La2
            android.graphics.drawable.Drawable r10 = defpackage.AbstractC1266Jt0.a(r1, r2, r5, r11)
            goto La6
        La2:
            android.graphics.drawable.Drawable r10 = defpackage.AbstractC1266Jt0.a(r1, r1, r5, r10)
        La6:
            if (r10 == 0) goto Lad
            G52 r11 = new G52
            r11.<init>(r10)
        Lad:
            return r11
        Lae:
            r11 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r5.concat(r10)
            r0.<init>(r10, r11)
            throw r0
        Lbd:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r5.concat(r10)
            r11.<init>(r10)
            throw r11
        Lcb:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r0 = "Failed to obtain context or unrecognized Uri format for: "
            java.lang.String r10 = r0.concat(r10)
            r11.<init>(r10, r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.UO2.c(android.net.Uri, Ee2):JO2");
    }
}
