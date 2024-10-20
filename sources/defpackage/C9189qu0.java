package defpackage;

import java.util.ArrayList;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.components.image_fetcher.ImageFetcher;
import org.chromium.components.omnibox.AutocompleteMatch;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9189qu0 {
    public final InterfaceC0079Ap3 b;
    public final InterfaceC4272cc2 c;
    public C7548m71 d;
    public InterfaceC0079Ap3 e;
    public ImageFetcher f;
    public TH0 g;
    public LargeIconBridge h;
    public final InterfaceC6114hx i;
    public boolean k;
    public final ArrayList a = new ArrayList();
    public int j = -1;

    public C9189qu0(InterfaceC0079Ap3 interfaceC0079Ap3, InterfaceC6114hx interfaceC6114hx, C4959ec2 c4959ec2) {
        this.b = interfaceC0079Ap3;
        this.i = interfaceC6114hx;
        this.c = c4959ec2;
    }

    public final void b(InterfaceC7444lp3 interfaceC7444lp3) {
        this.a.add(interfaceC7444lp3);
    }

    public final InterfaceC7444lp3 a(AutocompleteMatch autocompleteMatch, int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i2 >= arrayList.size()) {
                return null;
            }
            InterfaceC7444lp3 interfaceC7444lp3 = (InterfaceC7444lp3) arrayList.get(i2);
            if (interfaceC7444lp3.c(autocompleteMatch, i)) {
                return interfaceC7444lp3;
            }
            i2++;
        }
    }
}
