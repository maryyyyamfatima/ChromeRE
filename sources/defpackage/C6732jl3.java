package defpackage;

import android.app.Activity;
import androidx.appcompat.app.a;
import org.chromium.base.Callback;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jl3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6732jl3 {
    public final ViewOnLayoutChangeListenerC0059Al3 a;
    public final C0319Cl3 b;
    public boolean c;
    public RunnableC6046hl3 d;
    public int e;
    public ViewOnLayoutChangeListenerC10125te4 f;
    public final ResourceManager g;
    public boolean h;
    public final Activity i;
    public final Callback j;
    public boolean k;

    public C6732jl3(a aVar, ResourceManager resourceManager, CC cc, C6900kE3 c6900kE3, InterfaceC0079Ap3 interfaceC0079Ap3, C7244lE3 c7244lE3) {
        this.i = aVar;
        this.g = resourceManager;
        this.j = c7244lE3;
        this.b = new C0319Cl3(cc);
        this.a = new ViewOnLayoutChangeListenerC0059Al3(cc, c6900kE3, interfaceC0079Ap3);
    }
}
