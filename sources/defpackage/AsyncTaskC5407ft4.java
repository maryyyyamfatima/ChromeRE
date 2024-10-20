package defpackage;

import android.os.AsyncTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ft4 */
/* loaded from: classes.dex */
public final class AsyncTaskC5407ft4 extends AsyncTask {
    public final /* synthetic */ C6781jt4 a;

    public /* synthetic */ AsyncTaskC5407ft4(C6781jt4 c6781jt4) {
        this.a = c6781jt4;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Cv4 cv4 = C6781jt4.r;
        C6781jt4 c6781jt4 = this.a;
        if (c6781jt4.e() != null) {
            try {
                VS0 e = c6781jt4.e();
                Qv4 qv4 = c6781jt4.l;
                return Ju4.b(e, qv4.a(), qv4.b());
            } catch (Hu4 | IllegalStateException e2) {
                Pu4.a(e2.getMessage(), new Object[0]);
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Aw4 aw4 = (Aw4) obj;
        C6781jt4 c6781jt4 = this.a;
        c6781jt4.m = aw4;
        if (aw4 != null) {
            c6781jt4.f();
            c6781jt4.g.b(aw4);
            Is4 is4 = Is4.SUCCESS;
            Cv4 cv4 = c6781jt4.b;
            Cv4 cv42 = C6781jt4.r;
            if (cv4 != cv42) {
                c6781jt4.b = cv42;
                synchronized (cv4) {
                    cv4.e(is4);
                }
                return;
            }
            return;
        }
        Is4 is42 = Is4.ERROR_CONNECTING_TO_SERVICE;
        C8844pt4 c8844pt4 = c6781jt4.h;
        if (c8844pt4 != null) {
            c8844pt4.a.setVisibility(8);
            c8844pt4.g.setVisibility(0);
        }
        Cv4 cv43 = c6781jt4.b;
        Cv4 cv44 = C6781jt4.r;
        if (cv43 != cv44) {
            c6781jt4.b = cv44;
            synchronized (cv43) {
                cv43.e(is42);
            }
        }
    }
}
