package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.text.TextUtils;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sq */
/* loaded from: classes.dex */
public class C9849sq extends AbstractC10828vh3 implements InterfaceC1912Os2 {
    public static final String[] i = {"GUID", "ORIGIN", "NAME_FULL", "COMPANY_NAME", "ADDRESS_LINE1", "ADDRESS_LINE2", "ADDRESS_CITY", "ADDRESS_STATE", "ADDRESS_ZIP", "ADDRESS_COUNTRY_CODE", "PHONE_WHOLE_NUMBER", "EMAIL_ADDRESS", "IS_DEFAULT_BILLING_ADDRESS", "IS_DEFAULT_SHIPPING_ADDRESS"};
    public static final String[] j = {"GUID", "ORIGIN", "NAME_FULL", "CREDIT_CARD_NUMBER", "EXPIRATION_MONTH", "EXPIRATION_YEAR", "IS_DEFAULT_CREDIT_CARD"};
    public final Object g = new Object();
    public UriMatcher h;

    public final void n() {
        if (!C4502dG0.b.e(1, c(), "com.google.android.gms")) {
            throw new SecurityException("Invalid call from non-GmsCore client");
        }
    }

    public static Uri k(Context context, String str) {
        return Uri.parse("content://" + context.getPackageName() + ".AutofillDataProvider/" + str);
    }

    public final void o() {
        synchronized (this.g) {
            if (this.h != null) {
                return;
            }
            String str = c().getPackageName() + ".AutofillDataProvider";
            UriMatcher uriMatcher = new UriMatcher(-1);
            this.h = uriMatcher;
            uriMatcher.addURI(str, "addresses/*", 0);
            this.h.addURI(str, "addresses/*/*", 1);
            this.h.addURI(str, "creditcards/*", 2);
            this.h.addURI(str, "creditcards/*/*", 3);
        }
    }

    public static String i(ContentValues contentValues) {
        if (TextUtils.isEmpty(contentValues.getAsString("ORIGIN"))) {
            contentValues.put("ORIGIN", "Chrome Autofill dialog");
        }
        return (String) ThreadUtils.g(new CallableC8478oq(contentValues));
    }

    public static String j(ContentValues contentValues) {
        if (TextUtils.isEmpty(contentValues.getAsString("ORIGIN"))) {
            contentValues.put("ORIGIN", "Chrome Autofill dialog");
        }
        return (String) ThreadUtils.g(new CallableC8821pq(contentValues));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.database.MatrixCursor l(java.lang.String r11, java.lang.String r12, java.util.List r13) {
        /*
            if (r13 != 0) goto L4
            r11 = 0
            return r11
        L4:
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            java.lang.String[] r1 = defpackage.C9849sq.i
            int r2 = r13.size()
            r0.<init>(r1, r2)
            r1 = 14
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r4 = r3
        L15:
            int r5 = r13.size()
            if (r4 >= r5) goto Ld0
            java.lang.Object r5 = r13.get(r4)
            org.chromium.chrome.browser.autofill.PersonalDataManager$AutofillProfile r5 = (org.chromium.chrome.browser.autofill.PersonalDataManager.AutofillProfile) r5
            if (r5 != 0) goto L25
            goto Lc1
        L25:
            java.lang.String r6 = r5.getStreetAddress()
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            r8 = 1
            java.lang.String r9 = ""
            if (r7 != 0) goto L4c
            java.lang.String r7 = "\n"
            boolean r10 = r6.contains(r7)
            if (r10 == 0) goto L4c
            java.lang.String[] r6 = r6.split(r7)
            int r7 = r6.length
            if (r7 <= 0) goto L44
            r7 = r6[r3]
            goto L45
        L44:
            r7 = r9
        L45:
            int r10 = r6.length
            if (r10 <= r8) goto L4b
            r6 = r6[r8]
            r9 = r6
        L4b:
            r6 = r7
        L4c:
            java.lang.String r7 = r5.getGUID()
            r2[r3] = r7
            java.lang.String r7 = r5.getOrigin()
            r2[r8] = r7
            r7 = 2
            java.lang.String r10 = r5.getFullName()
            r2[r7] = r10
            r7 = 3
            java.lang.String r10 = r5.getCompanyName()
            r2[r7] = r10
            r7 = 4
            r2[r7] = r6
            r6 = 5
            r2[r6] = r9
            r6 = 6
            java.lang.String r7 = r5.getLocality()
            r2[r6] = r7
            r6 = 7
            java.lang.String r7 = r5.getRegion()
            r2[r6] = r7
            r6 = 8
            java.lang.String r7 = r5.getPostalCode()
            r2[r6] = r7
            r6 = 9
            java.lang.String r7 = r5.getCountryCode()
            r2[r6] = r7
            r6 = 10
            java.lang.String r7 = r5.getPhoneNumber()
            r2[r6] = r7
            r6 = 11
            java.lang.String r7 = r5.getEmailAddress()
            r2[r6] = r7
            java.lang.String r6 = r5.getGUID()
            boolean r6 = android.text.TextUtils.equals(r11, r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 12
            r2[r7] = r6
            java.lang.String r5 = r5.getGUID()
            boolean r5 = android.text.TextUtils.equals(r12, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 13
            r2[r6] = r5
            r5 = r3
        Lbb:
            if (r5 >= r1) goto Lc6
            r6 = r2[r5]
            if (r6 != 0) goto Lc3
        Lc1:
            r8 = r3
            goto Lc6
        Lc3:
            int r5 = r5 + 1
            goto Lbb
        Lc6:
            if (r8 != 0) goto Lc9
            goto Lcc
        Lc9:
            r0.addRow(r2)
        Lcc:
            int r4 = r4 + 1
            goto L15
        Ld0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9849sq.l(java.lang.String, java.lang.String, java.util.List):android.database.MatrixCursor");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.database.MatrixCursor m(java.lang.String r9, java.util.List r10) {
        /*
            if (r10 != 0) goto L4
            r9 = 0
            return r9
        L4:
            android.database.MatrixCursor r0 = new android.database.MatrixCursor
            java.lang.String[] r1 = defpackage.C9849sq.j
            int r2 = r10.size()
            r0.<init>(r1, r2)
            r1 = 7
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r4 = r3
        L14:
            int r5 = r10.size()
            if (r4 >= r5) goto L70
            java.lang.Object r5 = r10.get(r4)
            org.chromium.chrome.browser.autofill.PersonalDataManager$CreditCard r5 = (org.chromium.chrome.browser.autofill.PersonalDataManager.CreditCard) r5
            if (r5 != 0) goto L23
            goto L62
        L23:
            java.lang.String r6 = r5.getGUID()
            r2[r3] = r6
            java.lang.String r6 = r5.getOrigin()
            r7 = 1
            r2[r7] = r6
            r6 = 2
            java.lang.String r8 = r5.getName()
            r2[r6] = r8
            r6 = 3
            java.lang.String r8 = r5.getNumber()
            r2[r6] = r8
            r6 = 4
            java.lang.String r8 = r5.getMonth()
            r2[r6] = r8
            r6 = 5
            java.lang.String r8 = r5.getYear()
            r2[r6] = r8
            java.lang.String r5 = r5.getGUID()
            boolean r5 = android.text.TextUtils.equals(r9, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 6
            r2[r6] = r5
            r5 = r3
        L5c:
            if (r5 >= r1) goto L67
            r6 = r2[r5]
            if (r6 != 0) goto L64
        L62:
            r7 = r3
            goto L67
        L64:
            int r5 = r5 + 1
            goto L5c
        L67:
            if (r7 != 0) goto L6a
            goto L6d
        L6a:
            r0.addRow(r2)
        L6d:
            int r4 = r4 + 1
            goto L14
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9849sq.m(java.lang.String, java.util.List):android.database.MatrixCursor");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.ObjectInputStream] */
    @Override // defpackage.AbstractC10828vh3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.database.MatrixCursor f(android.net.Uri r7, java.lang.String[] r8) {
        /*
            r6 = this;
            r6.n()
            r6.o()
            android.content.UriMatcher r8 = r6.h
            int r8 = r8.match(r7)
            java.util.List r0 = r7.getPathSegments()
            int r1 = r0.size()
            r2 = 0
            r3 = 1
            if (r1 <= r3) goto L4d
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            android.util.Base64InputStream r4 = new android.util.Base64InputStream     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r0 = 8
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            java.lang.Object r0 = r1.readObject()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L47
            tq r0 = (defpackage.AbstractC10192tq) r0     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L47
            goto L43
        L3a:
            r0 = move-exception
            goto L40
        L3c:
            r7 = move-exception
            goto L49
        L3e:
            r0 = move-exception
            r1 = r2
        L40:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L47
        L43:
            defpackage.AbstractC2663Um3.a(r1)
            goto L4d
        L47:
            r7 = move-exception
            r2 = r1
        L49:
            defpackage.AbstractC2663Um3.a(r2)
            throw r7
        L4d:
            if (r8 == 0) goto Lb1
            if (r8 == r3) goto L96
            r0 = 2
            if (r8 == r0) goto L86
            r0 = 3
            if (r8 != r0) goto L72
            java.lang.String r8 = r7.getLastPathSegment()
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L62
            goto Lc0
        L62:
            rq r0 = new rq
            r0.<init>(r8)
            java.lang.Object r8 = org.chromium.base.ThreadUtils.g(r0)
            java.util.List r8 = (java.util.List) r8
            android.database.MatrixCursor r2 = m(r2, r8)
            goto Lc0
        L72:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AutofillDataProvider: query - unknown URL uri = "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L86:
            rq r8 = new rq
            r8.<init>(r2)
            java.lang.Object r8 = org.chromium.base.ThreadUtils.g(r8)
            java.util.List r8 = (java.util.List) r8
            android.database.MatrixCursor r2 = m(r2, r8)
            goto Lc0
        L96:
            java.lang.String r8 = r7.getLastPathSegment()
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto La1
            goto Lc0
        La1:
            qq r0 = new qq
            r0.<init>(r8)
            java.lang.Object r8 = org.chromium.base.ThreadUtils.g(r0)
            java.util.List r8 = (java.util.List) r8
            android.database.MatrixCursor r2 = l(r2, r2, r8)
            goto Lc0
        Lb1:
            qq r8 = new qq
            r8.<init>(r2)
            java.lang.Object r8 = org.chromium.base.ThreadUtils.g(r8)
            java.util.List r8 = (java.util.List) r8
            android.database.MatrixCursor r2 = l(r2, r2, r8)
        Lc0:
            if (r2 != 0) goto Lca
            android.database.MatrixCursor r2 = new android.database.MatrixCursor
            r8 = 0
            java.lang.String[] r8 = new java.lang.String[r8]
            r2.<init>(r8)
        Lca:
            android.content.Context r8 = r6.c()
            android.content.ContentResolver r8 = r8.getContentResolver()
            r2.setNotificationUri(r8, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9849sq.f(android.net.Uri, java.lang.String[]):android.database.MatrixCursor");
    }

    @Override // defpackage.AbstractC10828vh3
    public final Uri e(Uri uri, ContentValues contentValues) {
        String i2;
        n();
        o();
        int match = this.h.match(uri);
        if (match == 0) {
            contentValues.put("GUID", "");
            i2 = i(contentValues);
        } else if (match == 2) {
            contentValues.put("GUID", "");
            i2 = j(contentValues);
        } else {
            throw new IllegalArgumentException("AutofillDataProvider: insert - unknown URL " + uri);
        }
        Uri withAppendedPath = i2 != null ? Uri.withAppendedPath(uri, i2) : null;
        if (withAppendedPath != null) {
            c().getContentResolver().notifyChange(withAppendedPath, null);
        }
        return withAppendedPath;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:            if (i(r5) != null) goto L69;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:            if (j(r5) != null) goto L69;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:            r1 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:            if (r1 == 0) goto L71;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:            c().getContentResolver().notifyChange(r4, null);     */
    @Override // defpackage.AbstractC10828vh3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(android.net.Uri r4, android.content.ContentValues r5) {
        /*
            r3 = this;
            r3.n()
            r3.o()
            android.content.UriMatcher r0 = r3.h
            int r0 = r0.match(r4)
            r1 = 1
            if (r0 == r1) goto L2d
            r2 = 3
            if (r0 != r2) goto L19
            java.lang.String r5 = j(r5)
            if (r5 == 0) goto L34
            goto L35
        L19:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AutofillDataProvider: update - unknown URL "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L2d:
            java.lang.String r5 = i(r5)
            if (r5 == 0) goto L34
            goto L35
        L34:
            r1 = 0
        L35:
            if (r1 == 0) goto L43
            android.content.Context r5 = r3.c()
            android.content.ContentResolver r5 = r5.getContentResolver()
            r0 = 0
            r5.notifyChange(r4, r0)
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9849sq.h(android.net.Uri, android.content.ContentValues):int");
    }

    @Override // defpackage.AbstractC10828vh3
    public final int a(Uri uri) {
        n();
        o();
        throw new UnsupportedOperationException("AutofillDataProvider: DELETE is not supported for URI " + uri);
    }

    @Override // defpackage.AbstractC10828vh3
    public final String d(Uri uri) {
        n();
        o();
        int match = this.h.match(uri);
        if (match == 0) {
            return "vnd.android.gpswsci.cursor.dir/address";
        }
        if (match == 1) {
            return "vnd.android.gpswsci.cursor.item/address";
        }
        if (match == 2) {
            return "vnd.android.gpswsci.cursor.dir/creditcard";
        }
        if (match == 3) {
            return "vnd.android.gpswsci.cursor.item/creditcard";
        }
        throw new IllegalArgumentException("AutofillDataProvider: getType - unknown URL " + uri);
    }

    @Override // defpackage.InterfaceC1912Os2
    public final void C() {
        c().getContentResolver().notifyChange(k(c(), "addresses"), null);
        c().getContentResolver().notifyChange(k(c(), "creditcards"), null);
    }
}
