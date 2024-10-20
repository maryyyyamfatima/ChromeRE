package org.chromium.chrome.browser.history;

import J.N;
import defpackage.AbstractC2500Tg0;
import defpackage.AbstractC2630Ug0;
import defpackage.C1461Lg0;
import defpackage.C2370Sg0;
import defpackage.C4117c81;
import defpackage.InterfaceC7216l91;
import defpackage.Q81;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BrowsingHistoryBridge {
    public InterfaceC7216l91 a;
    public long b;
    public boolean c;
    public boolean d;

    public BrowsingHistoryBridge(Profile profile) {
        this.b = N.Mj1_ZHGA(this, profile);
    }

    public final void a() {
        if (this.c) {
            this.d = true;
            return;
        }
        this.c = true;
        this.d = false;
        N.MVl9wW5M(this.b, this);
    }

    public static void createHistoryItemAndAddToList(List list, GURL gurl, String str, String str2, long j, long[] jArr, boolean z) {
        list.add(new Q81(gurl, str, str2, j, jArr, z));
    }

    public void onQueryHistoryComplete(List list, boolean z) {
        boolean z2;
        InterfaceC7216l91 interfaceC7216l91 = this.a;
        if (interfaceC7216l91 != null) {
            C4117c81 c4117c81 = (C4117c81) interfaceC7216l91;
            if (c4117c81.w) {
                return;
            }
            boolean z3 = c4117c81.B;
            TreeSet treeSet = c4117c81.j;
            if (z3) {
                c4117c81.i = 0;
                Iterator it = treeSet.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((C2370Sg0) it.next()).b.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC2500Tg0) it2.next()).a = -1;
                    }
                }
                treeSet.clear();
                c4117c81.t();
                c4117c81.B = false;
            }
            if (!c4117c81.x && list.size() > 0 && !c4117c81.z) {
                c4117c81.Y();
                c4117c81.x = true;
            }
            if (c4117c81.P()) {
                treeSet.remove(treeSet.last());
                c4117c81.S();
                c4117c81.t();
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                AbstractC2500Tg0 abstractC2500Tg0 = (AbstractC2500Tg0) it3.next();
                Date date = new Date(abstractC2500Tg0.b());
                Iterator it4 = treeSet.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z2 = false;
                        break;
                    }
                    C2370Sg0 c2370Sg0 = (C2370Sg0) it4.next();
                    if (AbstractC2630Ug0.M(c2370Sg0.a, date) == 0) {
                        c2370Sg0.a(abstractC2500Tg0);
                        z2 = true;
                        break;
                    }
                }
                if (!z2) {
                    C1461Lg0 c1461Lg0 = new C1461Lg0(abstractC2500Tg0.b());
                    c1461Lg0.b = true;
                    C2370Sg0 c2370Sg02 = new C2370Sg0(abstractC2500Tg0.b());
                    c2370Sg02.a(c1461Lg0);
                    c2370Sg02.a(abstractC2500Tg0);
                    treeSet.add(c2370Sg02);
                }
            }
            c4117c81.S();
            c4117c81.t();
            c4117c81.y = false;
            c4117c81.A = z;
            if (z) {
                c4117c81.c0();
            }
        }
    }

    public void onRemoveComplete() {
        this.c = false;
        if (this.d) {
            a();
        }
    }

    public void onRemoveFailed() {
        this.c = false;
        if (this.d) {
            a();
        }
    }

    public void onHistoryDeleted() {
        InterfaceC7216l91 interfaceC7216l91 = this.a;
        if (interfaceC7216l91 != null) {
            C4117c81 c4117c81 = (C4117c81) interfaceC7216l91;
            if (c4117c81.w) {
                return;
            }
            c4117c81.k.q.b();
            c4117c81.a0();
        }
    }

    public void hasOtherFormsOfBrowsingData(boolean z) {
        InterfaceC7216l91 interfaceC7216l91 = this.a;
        if (interfaceC7216l91 != null) {
            C4117c81 c4117c81 = (C4117c81) interfaceC7216l91;
            c4117c81.v = z;
            c4117c81.Z();
            c4117c81.k.g.m();
        }
    }
}
