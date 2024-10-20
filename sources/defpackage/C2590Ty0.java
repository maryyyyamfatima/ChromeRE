package defpackage;

import com.google.android.libraries.elements.interfaces.ComponentState;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ty0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2590Ty0 extends AbstractC9776sd4 implements InterfaceC6416iq0 {
    public final TreeMap h = new TreeMap();
    public volatile boolean i = false;

    @Override // defpackage.InterfaceC6416iq0
    public final synchronized void dispose() {
        if (this.i) {
            return;
        }
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((ComponentState) it.next()).dispose();
        }
        this.h.clear();
        this.i = true;
    }
}
