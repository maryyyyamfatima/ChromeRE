package defpackage;

import android.util.SparseArray;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10162tl implements InterfaceC10844vk1 {
    public final C10505ul a;

    @Override // defpackage.InterfaceC10844vk1
    public final boolean isActiveModel() {
        return false;
    }

    @Override // defpackage.InterfaceC10844vk1
    public final void a() {
        C10505ul c10505ul = this.a;
        SparseArray sparseArray = c10505ul.a;
        for (int i = 0; i < sparseArray.size(); i++) {
            Tab a = ((InterfaceC9819sl) sparseArray.valueAt(i)).a();
            if (a != null && a.isIncognito()) {
                c10505ul.c(a.getId());
            }
        }
    }

    @Override // defpackage.InterfaceC10844vk1
    public final boolean b() {
        SparseArray sparseArray = this.a.a;
        for (int i = 0; i < sparseArray.size(); i++) {
            Tab a = ((InterfaceC9819sl) sparseArray.valueAt(i)).a();
            if (a != null && a.isIncognito()) {
                return true;
            }
        }
        return false;
    }

    public C10162tl(C10505ul c10505ul) {
        this.a = c10505ul;
    }
}
