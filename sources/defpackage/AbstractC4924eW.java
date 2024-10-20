package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eW */
/* loaded from: classes.dex */
public abstract class AbstractC4924eW {
    public static final AtomicInteger a = new AtomicInteger(1);

    public static int b(int i, boolean z, AbstractC9896sy0 abstractC9896sy0) {
        if (!z && i != 2 && i != 0) {
            abstractC9896sy0.a(EnumC11438xU.z, "Only snap to start is implemented for vertical lists");
            return Integer.MIN_VALUE;
        }
        if (i != 1) {
            return i != 2 ? Integer.MIN_VALUE : -1;
        }
        return Integer.MAX_VALUE;
    }

    public static void a(RecyclerView recyclerView, InterfaceC9738sX interfaceC9738sX, CommandOuterClass$Command commandOuterClass$Command, InterfaceC8710pX interfaceC8710pX, C3998bo c3998bo, AbstractC5771gx0 abstractC5771gx0) {
        C2794Vn a2 = AbstractC9053qX.a();
        a2.a = recyclerView;
        a2.h = c3998bo;
        a2.f = abstractC5771gx0;
        ((C10081tX) interfaceC9738sX).a(commandOuterClass$Command, interfaceC8710pX.a(a2).a(), 2).c();
    }
}
