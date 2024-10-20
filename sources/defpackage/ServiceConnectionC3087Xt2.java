package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.LinkedList;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xt2 */
/* loaded from: classes.dex */
public final class ServiceConnectionC3087Xt2 extends AbstractC0940Hg implements InterfaceC11522xj, ServiceConnection {
    public final LinkedList a = new LinkedList();
    public boolean g;
    public InterfaceC0657Fb1 h;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.chromium.components.webapps.AppData a(defpackage.ServiceConnectionC3087Xt2 r7, java.lang.String r8, java.lang.String r9, android.os.Bundle r10, int r11) {
        /*
            r7.getClass()
            if (r10 != 0) goto L7
            goto Lb9
        L7:
            java.lang.String r7 = "title"
            java.lang.String r7 = r10.getString(r7)
            java.lang.String r0 = "star_rating"
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r10.getFloat(r0, r1)
            java.lang.String r1 = "purchase_button_text"
            java.lang.String r1 = r10.getString(r1)
            java.lang.String r2 = "details_intent"
            android.os.Parcelable r2 = r10.getParcelable(r2)
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
            java.lang.String r3 = "https://play.google.com/store/apps/details"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.net.Uri$Builder r3 = r3.buildUpon()
            java.lang.String r4 = "id"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r4, r8)
            int r4 = r9.length()
            if (r4 <= 0) goto L3e
            java.lang.String r4 = "referrer"
            r3.appendQueryParameter(r4, r9)
        L3e:
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.VIEW"
            android.net.Uri r3 = r3.build()
            r9.<init>(r4, r3)
            java.lang.String r3 = "com.android.vending"
            r9.setPackage(r3)
            java.lang.String r4 = "fife_url"
            java.lang.String r4 = r10.getString(r4)
            if (r4 == 0) goto L89
            java.net.URI r5 = new java.net.URI     // Catch: java.net.URISyntaxException -> L70
            r5.<init>(r4)     // Catch: java.net.URISyntaxException -> L70
            java.lang.String r6 = r5.getPath()     // Catch: java.net.URISyntaxException -> L70
            if (r6 == 0) goto L70
            java.lang.String r5 = r5.getPath()     // Catch: java.net.URISyntaxException -> L70
            java.lang.String r6 = "="
            int r5 = r5.indexOf(r6)     // Catch: java.net.URISyntaxException -> L70
            r6 = -1
            if (r5 != r6) goto L70
            r5 = 1
            goto L71
        L70:
            r5 = 0
        L71:
            if (r5 != 0) goto L74
            goto L89
        L74:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            java.lang.String r4 = "=s"
            r10.append(r4)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            goto L8f
        L89:
            java.lang.String r11 = "image_url"
            java.lang.String r10 = r10.getString(r11)
        L8f:
            if (r7 == 0) goto Lb9
            r11 = 0
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 < 0) goto Lb9
            if (r10 == 0) goto Lb9
            if (r1 == 0) goto Lb9
            if (r2 == 0) goto Lb9
            java.lang.String r11 = r2.getCreatorPackage()
            boolean r11 = android.text.TextUtils.equals(r11, r3)
            if (r11 != 0) goto La7
            goto Lb9
        La7:
            org.chromium.components.webapps.AppData r11 = new org.chromium.components.webapps.AppData
            r11.<init>(r8)
            r11.b = r7
            r11.c = r10
            r11.d = r0
            r11.e = r1
            r11.f = r2
            r11.g = r9
            goto Lba
        Lb9:
            r11 = 0
        Lba:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ServiceConnectionC3087Xt2.a(Xt2, java.lang.String, java.lang.String, android.os.Bundle, int):org.chromium.components.webapps.AppData");
    }

    public ServiceConnectionC3087Xt2() {
        ApplicationStatus.d(this);
    }

    @Override // defpackage.InterfaceC11522xj
    public final void n(int i) {
        if (ApplicationStatus.hasVisibleActivities()) {
            return;
        }
        b();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0657Fb1 c0397Db1;
        this.g = false;
        int i = AbstractBinderC0527Eb1.a;
        if (iBinder == null) {
            c0397Db1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.details.IDetailsService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0657Fb1)) {
                c0397Db1 = (InterfaceC0657Fb1) queryLocalInterface;
            } else {
                c0397Db1 = new C0397Db1(iBinder);
            }
        }
        this.h = c0397Db1;
        Object obj = ThreadUtils.a;
        LinkedList linkedList = this.a;
        if (linkedList.isEmpty()) {
            b();
        } else {
            ((AbstractC0185Bl) linkedList.pop()).c(AbstractC0185Bl.e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.h = null;
        b();
    }

    public final void b() {
        Object obj = ThreadUtils.a;
        if (this.h != null) {
            V60.a.unbindService(this);
        }
        this.a.clear();
        this.h = null;
        this.g = false;
    }
}
