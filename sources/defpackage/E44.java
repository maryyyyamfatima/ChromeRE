package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class E44 {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:            if (r9 == 0) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:            if (r9 != 0) goto L20;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v12, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.content.Context r9) {
        /*
            java.lang.String r0 = "Can't get key use_location_for_services from "
            android.content.ContentResolver r1 = r9.getContentResolver()
            java.lang.String r9 = "use_location_for_services"
            android.net.Uri r7 = defpackage.AbstractC3750b41.a
            r8 = 0
            java.lang.String r2 = "value"
            java.lang.String[] r3 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L32 android.database.SQLException -> L34
            java.lang.String r4 = "name=?"
            java.lang.String[] r5 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L32 android.database.SQLException -> L34
            r6 = 0
            r2 = r7
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L32 android.database.SQLException -> L34
            if (r9 == 0) goto L2f
            boolean r1 = r9.moveToFirst()     // Catch: android.database.SQLException -> L2d java.lang.Throwable -> L56
            if (r1 != 0) goto L26
            goto L2f
        L26:
            r1 = 0
            java.lang.String r0 = r9.getString(r1)     // Catch: android.database.SQLException -> L2d java.lang.Throwable -> L56
            r8 = r0
            goto L4a
        L2d:
            r1 = move-exception
            goto L37
        L2f:
            if (r9 == 0) goto L4d
            goto L4a
        L32:
            r9 = move-exception
            goto L59
        L34:
            r9 = move-exception
            r1 = r9
            r9 = r8
        L37:
            java.lang.String r2 = "GoogleSettings"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L56
            r3.append(r7)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L56
            android.util.Log.e(r2, r0, r1)     // Catch: java.lang.Throwable -> L56
            if (r9 == 0) goto L4d
        L4a:
            r9.close()
        L4d:
            if (r8 == 0) goto L54
            int r9 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L54
            goto L55
        L54:
            r9 = 2
        L55:
            return r9
        L56:
            r0 = move-exception
            r8 = r9
            r9 = r0
        L59:
            if (r8 == 0) goto L5e
            r8.close()
        L5e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.E44.a(android.content.Context):int");
    }
}
