package org.chromium.content.browser;

import J.N;
import android.text.TextUtils;
import defpackage.InterfaceC0218Br2;
import defpackage.O40;
import defpackage.Q40;
import defpackage.R40;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.content.browser.ContactsDialogHost;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ContactsDialogHost implements R40 {
    public long a;
    public final WebContents b;

    public static ContactsDialogHost create(WebContents webContents, long j) {
        return new ContactsDialogHost(j, webContents);
    }

    public ContactsDialogHost(long j, WebContents webContents) {
        this.a = j;
        this.b = webContents;
    }

    public void destroy() {
        this.a = 0L;
    }

    public final void showDialog(final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final String str) {
        WindowAndroid Q0 = this.b.Q0();
        if (Q0.k().get() != null) {
            if (Q0.hasPermission("android.permission.READ_CONTACTS")) {
                if (O40.a(this.b, this, z, z2, z3, z4, z5, z6, str)) {
                    return;
                }
                N.MOM50EIZ(this.a);
                return;
            } else if (Q0.canRequestPermission("android.permission.READ_CONTACTS")) {
                Q0.b(new String[]{"android.permission.READ_CONTACTS"}, new InterfaceC0218Br2() { // from class: L40
                    @Override // defpackage.InterfaceC0218Br2
                    public final void b(int[] iArr, String[] strArr) {
                        boolean z7 = z;
                        boolean z8 = z2;
                        boolean z9 = z3;
                        boolean z10 = z4;
                        boolean z11 = z5;
                        boolean z12 = z6;
                        String str2 = str;
                        ContactsDialogHost contactsDialogHost = ContactsDialogHost.this;
                        contactsDialogHost.getClass();
                        if (strArr.length == 1 && iArr.length == 1 && TextUtils.equals(strArr[0], "android.permission.READ_CONTACTS") && iArr[0] == 0) {
                            if (O40.a(contactsDialogHost.b, contactsDialogHost, z7, z8, z9, z10, z11, z12, str2)) {
                                return;
                            }
                            N.MOM50EIZ(contactsDialogHost.a);
                            return;
                        }
                        N.MOM50EIZ(contactsDialogHost.a);
                    }
                });
                return;
            } else {
                N.MOM50EIZ(this.a);
                return;
            }
        }
        N.MOM50EIZ(this.a);
    }

    public final void a(int i, ArrayList arrayList, int i2, int i3) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        if (i == 0) {
            N.MwwTaBAE(j, 0, i3);
            return;
        }
        if (i != 1) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Q40 q40 = (Q40) it.next();
            long j2 = this.a;
            List list = q40.a;
            String[] strArr = list != null ? (String[]) list.toArray(new String[list.size()]) : null;
            List list2 = q40.b;
            String[] strArr2 = list2 != null ? (String[]) list2.toArray(new String[list2.size()]) : null;
            List list3 = q40.c;
            String[] strArr3 = list3 != null ? (String[]) list3.toArray(new String[list3.size()]) : null;
            ArrayList arrayList2 = q40.d;
            ByteBuffer[] byteBufferArr = arrayList2 != null ? (ByteBuffer[]) arrayList2.toArray(new ByteBuffer[arrayList2.size()]) : null;
            ArrayList arrayList3 = q40.e;
            N.MS9BZrW0(j2, strArr, strArr2, strArr3, byteBufferArr, arrayList3 != null ? (ByteBuffer[]) arrayList3.toArray(new ByteBuffer[arrayList3.size()]) : null);
        }
        N.MwwTaBAE(this.a, i2, i3);
    }
}
