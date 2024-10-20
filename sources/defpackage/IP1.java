package defpackage;

import android.view.View;
import androidx.mediarouter.app.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IP1 implements View.OnClickListener {
    public final /* synthetic */ d a;

    public IP1(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r13 = r13.getId()
            r0 = 1
            androidx.mediarouter.app.d r1 = r12.a
            r2 = 16908313(0x1020019, float:2.38773E-38)
            if (r13 == r2) goto Lbc
            r3 = 16908314(0x102001a, float:2.3877302E-38)
            if (r13 != r3) goto L13
            goto Lbc
        L13:
            r2 = 2130773152(0x7f0104a0, float:1.7149443E38)
            if (r13 != r2) goto Lb3
            zN1 r13 = r1.W
            if (r13 == 0) goto Ld2
            android.support.v4.media.session.PlaybackStateCompat r2 = r1.Y
            if (r2 == 0) goto Ld2
            int r3 = r2.a
            r4 = 3
            r5 = 0
            if (r3 != r4) goto L28
            r3 = r0
            goto L29
        L28:
            r3 = r5
        L29:
            r6 = 0
            if (r3 == 0) goto L48
            long r8 = r2.j
            r10 = 514(0x202, double:2.54E-321)
            long r8 = r8 & r10
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 == 0) goto L38
            r4 = r0
            goto L39
        L38:
            r4 = r5
        L39:
            if (r4 == 0) goto L48
            wN1 r13 = r13.b()
            android.media.session.MediaController$TransportControls r13 = r13.a
            r13.pause()
            r5 = 2132018815(0x7f14067f, float:1.9675947E38)
            goto L80
        L48:
            if (r3 == 0) goto L65
            long r8 = r2.j
            r10 = 1
            long r8 = r8 & r10
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 == 0) goto L55
            r4 = r0
            goto L56
        L55:
            r4 = r5
        L56:
            if (r4 == 0) goto L65
            wN1 r13 = r13.b()
            android.media.session.MediaController$TransportControls r13 = r13.a
            r13.stop()
            r5 = 2132018817(0x7f140681, float:1.9675951E38)
            goto L80
        L65:
            if (r3 != 0) goto L80
            long r2 = r2.j
            r8 = 516(0x204, double:2.55E-321)
            long r2 = r2 & r8
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L71
            goto L72
        L71:
            r0 = r5
        L72:
            if (r0 == 0) goto L80
            wN1 r13 = r13.b()
            android.media.session.MediaController$TransportControls r13 = r13.a
            r13.play()
            r5 = 2132018816(0x7f140680, float:1.967595E38)
        L80:
            android.view.accessibility.AccessibilityManager r13 = r1.r0
            if (r13 == 0) goto Ld2
            boolean r0 = r13.isEnabled()
            if (r0 == 0) goto Ld2
            if (r5 == 0) goto Ld2
            r0 = 16384(0x4000, float:2.2959E-41)
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain(r0)
            android.content.Context r1 = r1.n
            java.lang.String r2 = r1.getPackageName()
            r0.setPackageName(r2)
            java.lang.Class<IP1> r2 = defpackage.IP1.class
            java.lang.String r2 = r2.getName()
            r0.setClassName(r2)
            java.util.List r2 = r0.getText()
            java.lang.String r1 = r1.getString(r5)
            r2.add(r1)
            r13.sendAccessibilityEvent(r0)
            goto Ld2
        Lb3:
            r0 = 2130773150(0x7f01049e, float:1.7149439E38)
            if (r13 != r0) goto Ld2
            r1.dismiss()
            goto Ld2
        Lbc:
            DQ1 r3 = r1.m
            boolean r3 = r3.g()
            if (r3 == 0) goto Lcf
            if (r13 != r2) goto Lc7
            r0 = 2
        Lc7:
            MQ1 r13 = r1.k
            r13.getClass()
            defpackage.MQ1.m(r0)
        Lcf:
            r1.dismiss()
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IP1.onClick(android.view.View):void");
    }
}
