package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Process;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Iv1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1147Iv1 implements InterfaceC1666Mv1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ C2056Pv1 f;

    public C1147Iv1(int i, Context context, String str, int i2, String str2, C2056Pv1 c2056Pv1) {
        this.a = i;
        this.b = context;
        this.c = str;
        this.d = i2;
        this.e = str2;
        this.f = c2056Pv1;
    }

    @Override // defpackage.InterfaceC1666Mv1
    public final void a(C1796Nv1 c1796Nv1) {
        int i = this.a;
        final String str = this.c;
        final Context context = this.b;
        if (i == 2) {
            if (c1796Nv1.j) {
                AbstractC0185Bl.e.execute(new Runnable() { // from class: Hv1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        if (AbstractC2446Sv1.g(context2)) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("API", "saveURLBlockedReport");
                            contentValues.put("url", str);
                            context2.getContentResolver().insert(Uri.withAppendedPath(new Uri.Builder().scheme("content").authority("com.sec.knox.provider").build(), "FirewallPolicy"), contentValues);
                        }
                    }
                });
            }
        } else if (c1796Nv1.a) {
            ExecutorC11534xl executorC11534xl = AbstractC0185Bl.e;
            final int i2 = this.d;
            final String str2 = this.e;
            executorC11534xl.execute(new Runnable() { // from class: Gv1
                public final /* synthetic */ String h = "ChromeTab";

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    String c = AbstractC1277Jv1.c(i3);
                    long currentTimeMillis = System.currentTimeMillis();
                    int myPid = Process.myPid();
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC1277Jv1.a(i3));
                    sb.append(" ");
                    sb.append(str);
                    sb.append(" ");
                    boolean b = AbstractC1277Jv1.b(i3);
                    sb.append(b ? "succeeded" : "failed");
                    String str3 = str2;
                    sb.append(str3.isEmpty() ? "" : " ".concat(str3));
                    String sb2 = sb.toString();
                    Context context2 = context;
                    if (AbstractC2446Sv1.g(context2)) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("AuditEvent", c);
                        contentValues.put("timestamp", Long.valueOf(currentTimeMillis));
                        contentValues.put("severity", (Integer) 5);
                        contentValues.put("group", (Integer) 5);
                        contentValues.put("outcome", Boolean.valueOf(b));
                        contentValues.put("uid", Integer.valueOf(myPid));
                        contentValues.put("component", this.h);
                        contentValues.put("message", sb2);
                        contentValues.put("redactedMessage", "");
                        try {
                            context2.getContentResolver().insert(Uri.withAppendedPath(new Uri.Builder().scheme("content").authority("com.sec.knox.provider").build(), "AuditLog"), contentValues);
                        } catch (SQLiteException | IllegalArgumentException | SecurityException e) {
                            AbstractC4851eH1.a("KnoxSettingsProvider", "Error inserting audit log", e);
                        }
                    }
                }
            });
        }
        this.f.c.d(this);
    }
}
