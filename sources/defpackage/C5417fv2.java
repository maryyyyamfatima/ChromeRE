package defpackage;

import android.net.Uri;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.chromium.components.content_capture.ContentCaptureFrame;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fv2 */
/* loaded from: classes2.dex */
public final class C5417fv2 implements InterfaceC3411a50 {
    public C0108Av2 a;
    public final View b;

    public C5417fv2(View view) {
        this.b = view;
    }

    @Override // defpackage.InterfaceC3411a50
    public final boolean f(String[] strArr) {
        V24 v24 = C7823mv2.d.b;
        if (v24 != null) {
            HashSet hashSet = v24.a;
            List list = v24.b;
            if (list == null && hashSet == null) {
                return false;
            }
            for (String str : strArr) {
                String host = Uri.parse(str).getHost();
                if (host != null) {
                    if (hashSet == null || !hashSet.contains(host)) {
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((Pattern) it.next()).matcher(host).find()) {
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be A[RETURN] */
    @Override // defpackage.InterfaceC3411a50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.C10753vU0 r12, org.chromium.components.content_capture.ContentCaptureFrame r13) {
        /*
            r11 = this;
            Av2 r0 = r11.a
            if (r0 != 0) goto Lbf
            android.view.View r0 = r11.b
            android.view.contentcapture.ContentCaptureSession r1 = defpackage.AbstractC11254wv2.a(r0)
            if (r1 != 0) goto Ld
            goto L17
        Ld:
            android.view.ViewStructure r9 = defpackage.AbstractC11597xv2.a(r1, r0)
            android.view.autofill.AutofillId r10 = defpackage.Q72.a(r9)
            if (r10 != 0) goto L1a
        L17:
            r0 = 0
            goto Lba
        L1a:
            int r3 = r0.getLeft()
            int r4 = r0.getTop()
            r5 = 0
            r6 = 0
            int r2 = r0.getRight()
            int r7 = r0.getLeft()
            int r7 = r2 - r7
            int r2 = r0.getBottom()
            int r8 = r0.getTop()
            int r8 = r2 - r8
            r2 = r9
            r2.setDimens(r3, r4, r5, r6, r7, r8)
            int r2 = r0.getVisibility()
            r9.setVisibility(r2)
            boolean r2 = r0.isEnabled()
            r9.setEnabled(r2)
            boolean r2 = r0.isClickable()
            r9.setClickable(r2)
            boolean r2 = r0.isFocusable()
            r9.setFocusable(r2)
            boolean r2 = r0.isFocused()
            r9.setFocused(r2)
            boolean r2 = r0.isAccessibilityFocused()
            r9.setAccessibilityFocused(r2)
            boolean r2 = r0.isSelected()
            r9.setSelected(r2)
            boolean r2 = r0.isActivated()
            r9.setActivated(r2)
            boolean r2 = r0.isLongClickable()
            r9.setLongClickable(r2)
            boolean r2 = r0 instanceof android.widget.Checkable
            r3 = 1
            if (r2 == 0) goto L8f
            r9.setCheckable(r3)
            r2 = r0
            android.widget.Checkable r2 = (android.widget.Checkable) r2
            boolean r2 = r2.isChecked()
            if (r2 == 0) goto L8f
            r9.setChecked(r3)
        L8f:
            boolean r2 = r0.isOpaque()
            if (r2 == 0) goto L98
            defpackage.AbstractC11940yv2.a(r9)
        L98:
            boolean r2 = r0.isContextClickable()
            if (r2 == 0) goto La1
            r9.setContextClickable(r3)
        La1:
            java.lang.CharSequence r2 = r0.getAccessibilityClassName()
            if (r2 == 0) goto Lae
            java.lang.String r2 = r2.toString()
            r9.setClassName(r2)
        Lae:
            java.lang.CharSequence r0 = r0.getContentDescription()
            r9.setContentDescription(r0)
            Av2 r0 = new Av2
            r0.<init>(r1, r10)
        Lba:
            r11.a = r0
            if (r0 != 0) goto Lbf
            return
        Lbf:
            d50 r0 = new d50
            Av2 r1 = r11.a
            r0.<init>(r12, r13, r1)
            g43 r12 = defpackage.AbstractC0185Bl.f
            r0.c(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5417fv2.a(vU0, org.chromium.components.content_capture.ContentCaptureFrame):void");
    }

    @Override // defpackage.InterfaceC3411a50
    public final void b(C10753vU0 c10753vU0, ContentCaptureFrame contentCaptureFrame) {
        if (this.a == null) {
            return;
        }
        new P50(c10753vU0, contentCaptureFrame, this.a).c(AbstractC0185Bl.f);
    }

    @Override // defpackage.InterfaceC3411a50
    public final void e(C10753vU0 c10753vU0) {
        if (c10753vU0.isEmpty() || this.a == null) {
            return;
        }
        new M43(c10753vU0, this.a).c(AbstractC0185Bl.f);
    }

    @Override // defpackage.InterfaceC3411a50
    public final void d(ContentCaptureFrame contentCaptureFrame) {
        if (this.a == null) {
            return;
        }
        new NN3(contentCaptureFrame, this.a).c(AbstractC0185Bl.f);
    }

    @Override // defpackage.InterfaceC3411a50
    public final void c(ContentCaptureFrame contentCaptureFrame) {
        if (this.a == null) {
            return;
        }
        C10753vU0 c10753vU0 = new C10753vU0(1);
        c10753vU0.add(contentCaptureFrame);
        new C4512dI0(c10753vU0, this.a).c(AbstractC0185Bl.f);
    }

    @Override // defpackage.InterfaceC3411a50
    public final void g(C10753vU0 c10753vU0, long[] jArr) {
        if (c10753vU0.isEmpty() || this.a == null) {
            return;
        }
        new I50(c10753vU0, jArr, this.a).c(AbstractC0185Bl.f);
    }
}
