package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kv1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1407Kv1 extends AbstractC3362Zw2 {
    @Override // defpackage.AbstractC3362Zw2
    public final void a(int i, Context context, String str, String str2) {
        c(i, context, str, str2);
    }

    @Override // defpackage.AbstractC3362Zw2
    public final void b(final Context context, int i) {
        final int i2;
        switch (i) {
            case 1:
                i2 = 0;
                break;
            case 2:
                i2 = 1;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                i2 = 2;
                break;
            case 4:
                i2 = 3;
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                i2 = 4;
                break;
            case 6:
                i2 = 13;
                break;
            default:
                i2 = -1;
                break;
        }
        if (i2 == -1) {
            return;
        }
        AbstractC0185Bl.e.execute(new Runnable() { // from class: Fv1
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                if (AbstractC2446Sv1.g(context2)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("API", "notifyCertificateFailure");
                    contentValues.put("module", "Chrome_module");
                    contentValues.put("fail", Integer.valueOf(i2));
                    try {
                        context2.getContentResolver().insert(Uri.withAppendedPath(new Uri.Builder().scheme("content").authority("com.sec.knox.provider").build(), "CertificatePolicy"), contentValues);
                    } catch (SQLiteException | IllegalArgumentException | SecurityException e) {
                        AbstractC4851eH1.a("KnoxSettingsProvider", "Error inserting certificate failure", e);
                    }
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000c, code lost:            if (r9 != 4) goto L11;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(int r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            r0 = 1
            if (r9 == 0) goto L12
            r1 = 2
            if (r9 == r0) goto L10
            if (r9 == r1) goto Le
            r0 = 3
            if (r9 == r0) goto L12
            r0 = 4
            if (r9 == r0) goto L12
        Le:
            r0 = 0
            goto L12
        L10:
            r5 = r1
            goto L13
        L12:
            r5 = r0
        L13:
            Pv1 r0 = defpackage.C2056Pv1.d
            if (r0 != 0) goto L1e
            Pv1 r0 = new Pv1
            r0.<init>(r10)
            defpackage.C2056Pv1.d = r0
        L1e:
            Pv1 r0 = defpackage.C2056Pv1.d
            Iv1 r8 = new Iv1
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r7 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            za2 r9 = r0.c
            r9.a(r8)
            Nv1 r9 = r0.b
            if (r9 == 0) goto L37
            r8.a(r9)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1407Kv1.c(int, android.content.Context, java.lang.String, java.lang.String):void");
    }
}
