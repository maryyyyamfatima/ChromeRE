package defpackage;

import com.google.android.libraries.elements.interfaces.PerformOnceCommandController;
import com.google.android.libraries.elements.internal.PerformOnceCommandControllerModule$PerformOnceCommandControllerImpl;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tr2 */
/* loaded from: classes.dex */
public final class C10201tr2 implements InterfaceC9395rX {
    public final PerformOnceCommandController a;
    public final InterfaceC3241Yy1 b;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        C10544ur2 c10544ur2 = (C10544ur2) obj;
        InterfaceC9738sX interfaceC9738sX = (InterfaceC9738sX) this.b.get();
        boolean z = c10544ur2.k.length() > 0;
        PerformOnceCommandController performOnceCommandController = this.a;
        if (z && performOnceCommandController.contains(c10544ur2.k)) {
            return C5971hZ.a;
        }
        performOnceCommandController.insert(c10544ur2.k);
        CommandOuterClass$Command commandOuterClass$Command = c10544ur2.l;
        if (commandOuterClass$Command == null) {
            commandOuterClass$Command = CommandOuterClass$Command.l;
        }
        return ((C10081tX) interfaceC9738sX).a(commandOuterClass$Command, abstractC9053qX, 1);
    }

    public C10201tr2(PerformOnceCommandControllerModule$PerformOnceCommandControllerImpl performOnceCommandControllerModule$PerformOnceCommandControllerImpl, InterfaceC3241Yy1 interfaceC3241Yy1) {
        this.a = performOnceCommandControllerModule$PerformOnceCommandControllerImpl;
        this.b = interfaceC3241Yy1;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C10544ur2.p;
    }
}
