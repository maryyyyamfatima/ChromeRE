package com.google.android.libraries.elements.converters.properties.commands.platform;

import android.os.Looper;
import com.google.android.libraries.elements.converters.properties.commands.fusion.FusionCommandRunContext;
import com.google.android.libraries.elements.converters.properties.commands.platform.PlatformCommandResolver;
import com.google.android.libraries.elements.interfaces.CommandHandler;
import com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback;
import com.google.android.libraries.elements.interfaces.CommandRunContext;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import defpackage.AV;
import defpackage.AbstractC0562Ei1;
import defpackage.AbstractC10422uW2;
import defpackage.AbstractC12203zi0;
import defpackage.AbstractC1472Li1;
import defpackage.AbstractC2209Ra;
import defpackage.AbstractC2373Sg3;
import defpackage.AbstractC4591dY;
import defpackage.AbstractC9053qX;
import defpackage.AbstractC9076qb1;
import defpackage.AbstractC9307rF1;
import defpackage.AbstractC9896sy0;
import defpackage.C0042Ai1;
import defpackage.C0172Bi1;
import defpackage.C12149zZ;
import defpackage.C1342Ki1;
import defpackage.C14;
import defpackage.C2008Pl3;
import defpackage.C2794Vn;
import defpackage.C2924Wn;
import defpackage.C3560aY;
import defpackage.C4883eN3;
import defpackage.C4934eY;
import defpackage.C5563gM0;
import defpackage.C5971hZ;
import defpackage.C6315iZ;
import defpackage.C7001kZ;
import defpackage.CV0;
import defpackage.CZ;
import defpackage.DV;
import defpackage.EnumC11438xU;
import defpackage.H4;
import defpackage.InterfaceC11303x40;
import defpackage.InterfaceC11517xi0;
import defpackage.InterfaceC9395rX;
import defpackage.InterfaceC9989tE2;
import defpackage.NV0;
import defpackage.NX0;
import defpackage.OX0;
import defpackage.TQ0;
import defpackage.TV0;
import defpackage.U80;
import defpackage.V82;
import defpackage.VF0;
import defpackage.VY;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.Optional;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PlatformCommandResolver extends CommandHandler {
    private static final int JS_HANDLER_EXTENSION_ID = 342268478;
    private final long commandBloatMs;
    private final C3560aY commandResolverLogger;
    private final Optional commandThreadAffinityModelMap;
    private final InterfaceC9989tE2 debuggerStatusProvider;
    private final AbstractC1472Li1 duplicateExtensionFields;
    private final boolean enableCommandThreadAffinityModel;
    private final AbstractC0562Ei1 handlers;
    private final AbstractC10422uW2 scheduler;

    public PlatformCommandResolver(Map map, Set set, AbstractC9896sy0 abstractC9896sy0, Optional optional, Optional optional2, Optional optional3, AbstractC10422uW2 abstractC10422uW2, InterfaceC9989tE2 interfaceC9989tE2, Optional optional4, C3560aY c3560aY, InterfaceC9989tE2 interfaceC9989tE22) {
        Iterable[] iterableArr = {map.values(), set};
        for (int i = 0; i < 2; i++) {
            Iterable iterable = iterableArr[i];
        }
        TQ0 tq0 = new TQ0(iterableArr);
        AbstractC1472Li1 findDuplicateExtensionFields = findDuplicateExtensionFields(tq0, abstractC9896sy0);
        this.duplicateExtensionFields = findDuplicateExtensionFields;
        this.handlers = removeHandlersForExtensionFields(tq0, findDuplicateExtensionFields, interfaceC9989tE2);
        this.enableCommandThreadAffinityModel = ((Boolean) optional2.orElse(Boolean.FALSE)).booleanValue();
        this.commandThreadAffinityModelMap = optional3;
        this.scheduler = abstractC10422uW2;
        this.commandBloatMs = ((Long) optional4.orElse(0L)).longValue();
        this.commandResolverLogger = c3560aY;
        this.debuggerStatusProvider = interfaceC9989tE22;
    }

    private AbstractC10422uW2 getAffinitySchedulerForHandler(InterfaceC9395rX interfaceC9395rX, int i) {
        C4934eY c4934eY;
        interfaceC9395rX.b();
        if (!this.commandThreadAffinityModelMap.isPresent() || (c4934eY = (C4934eY) ((CV0) this.commandThreadAffinityModelMap.get()).apply(Integer.valueOf(i))) == null) {
            c4934eY = null;
        }
        if (c4934eY == null) {
            return null;
        }
        int a = AbstractC4591dY.a(c4934eY.k);
        if (a == 0) {
            a = 1;
        }
        int b = AbstractC2373Sg3.b(a);
        if (b == 1) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return null;
            }
            return AbstractC2209Ra.a();
        }
        if (b == 2 && Looper.myLooper() == Looper.getMainLooper()) {
            return this.scheduler;
        }
        return null;
    }

    public C4883eN3 createDebuggerTimelineEventId(AbstractC9053qX abstractC9053qX) {
        U80 u80;
        if (!((InterfaceC11517xi0) this.debuggerStatusProvider.get()).liveUpdateEnabled()) {
            return null;
        }
        if (abstractC9053qX == null) {
            u80 = U80.a;
        } else {
            u80 = ((C2924Wn) abstractC9053qX).i;
        }
        return AbstractC12203zi0.c(u80);
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandHandler
    public void run(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, final CommandRunCompletionCallback commandRunCompletionCallback) {
        AbstractC9053qX a;
        if (commandRunContext instanceof FusionCommandRunContext) {
            a = ((FusionCommandRunContext) commandRunContext).commandEventData();
        } else if (commandRunContext != null) {
            C2794Vn a2 = AbstractC9053qX.a();
            a2.e = commandRunContext.senderState();
            a = a2.a();
        } else {
            C2794Vn a3 = AbstractC9053qX.a();
            a3.e = SenderStateOuterClass$SenderState.l;
            a = a3.a();
        }
        VY resolve = resolve(commandOuterClass$Command, a);
        if (commandRunCompletionCallback != null) {
            H4 h4 = new H4() { // from class: cv2
                @Override // defpackage.H4
                public final void run() {
                    PlatformCommandResolver.lambda$run$0(CommandRunCompletionCallback.this);
                }
            };
            resolve.getClass();
            NV0 nv0 = TV0.d;
            resolve = new C12149zZ(new C12149zZ(resolve, nv0, nv0, h4), nv0, new InterfaceC11303x40() { // from class: dv2
                @Override // defpackage.InterfaceC11303x40
                public final void accept(Object obj) {
                    PlatformCommandResolver.lambda$run$1(CommandRunCompletionCallback.this, (Throwable) obj);
                }
            }, TV0.c);
        }
        resolve.c();
    }

    public static /* synthetic */ void lambda$run$0(CommandRunCompletionCallback commandRunCompletionCallback) {
        commandRunCompletionCallback.completion(Status.OK);
    }

    public static void lambda$run$1(CommandRunCompletionCallback commandRunCompletionCallback, Throwable th) {
        Status status;
        Throwable th2 = th;
        while (true) {
            if (th2 != null) {
                List list = Status.d;
                if (th2 instanceof StatusException) {
                    status = ((StatusException) th2).a;
                    break;
                } else {
                    if (th2 instanceof C2008Pl3) {
                        status = ((C2008Pl3) th2).a;
                        break;
                    }
                    th2 = th2.getCause();
                }
            } else {
                Status status2 = Status.e;
                status = V82.a(status2.c, th) ? status2 : new Status(status2.a, status2.b, th);
            }
        }
        commandRunCompletionCallback.completion(status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [VY] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ev2] */
    public VY resolve(final CommandOuterClass$Command commandOuterClass$Command, final AbstractC9053qX abstractC9053qX) {
        VF0 vf0;
        final InterfaceC9395rX interfaceC9395rX;
        AbstractC10422uW2 affinitySchedulerForHandler;
        C0172Bi1 listIterator = this.handlers.listIterator(0);
        CZ cz = null;
        VF0 vf02 = null;
        while (true) {
            if (!listIterator.hasNext()) {
                vf0 = vf02;
                interfaceC9395rX = null;
                break;
            }
            interfaceC9395rX = (InterfaceC9395rX) listIterator.next();
            VF0 a = interfaceC9395rX.a();
            commandOuterClass$Command.getClass();
            a.getClass();
            OX0 ox0 = (OX0) a;
            commandOuterClass$Command.v(ox0);
            C5563gM0 c5563gM0 = commandOuterClass$Command.j;
            c5563gM0.getClass();
            NX0 nx0 = ox0.d;
            nx0.getClass();
            if (c5563gM0.a.get(nx0) != null) {
                vf0 = a;
                break;
            }
            vf02 = a;
        }
        if (interfaceC9395rX == null) {
            return noHandlerCompletable(commandOuterClass$Command);
        }
        if (this.enableCommandThreadAffinityModel && vf0 != null && (affinitySchedulerForHandler = getAffinitySchedulerForHandler(interfaceC9395rX, ((OX0) vf0).d.a)) != null) {
            cz = new C7001kZ(new Callable() { // from class: ev2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object lambda$resolve$2;
                    lambda$resolve$2 = PlatformCommandResolver.this.lambda$resolve$2(interfaceC9395rX, commandOuterClass$Command, abstractC9053qX);
                    return lambda$resolve$2;
                }
            }).e(affinitySchedulerForHandler);
        }
        return this.commandResolverLogger.b(cz == null ? callHandler(interfaceC9395rX, commandOuterClass$Command, abstractC9053qX, this.commandBloatMs) : cz, commandOuterClass$Command, ((C2924Wn) abstractC9053qX).e, createDebuggerTimelineEventId(abstractC9053qX), vf0);
    }

    public /* synthetic */ Object lambda$resolve$2(InterfaceC9395rX interfaceC9395rX, CommandOuterClass$Command commandOuterClass$Command, AbstractC9053qX abstractC9053qX) {
        return callHandler(interfaceC9395rX, commandOuterClass$Command, abstractC9053qX, this.commandBloatMs);
    }

    private VY noHandlerCompletable(CommandOuterClass$Command commandOuterClass$Command) {
        C14 it = this.duplicateExtensionFields.iterator();
        while (it.hasNext()) {
            VF0 vf0 = (VF0) it.next();
            commandOuterClass$Command.getClass();
            vf0.getClass();
            OX0 ox0 = (OX0) vf0;
            commandOuterClass$Command.v(ox0);
            C5563gM0 c5563gM0 = commandOuterClass$Command.j;
            c5563gM0.getClass();
            NX0 nx0 = ox0.d;
            nx0.getClass();
            if (c5563gM0.a.get(nx0) != null) {
                return new C6315iZ(new IllegalStateException(AbstractC9307rF1.a("Suppressed command with extension ", ((OX0) vf0).d.a, " due to multiple conflicting handlers.")));
            }
        }
        int commandExtensionId = getCommandExtensionId(commandOuterClass$Command);
        if (commandExtensionId == 0) {
            return C5971hZ.a;
        }
        return new C6315iZ(new IllegalStateException(AbstractC9076qb1.a("Unrecognized command with extension id: ", commandExtensionId)));
    }

    private static AbstractC1472Li1 findDuplicateExtensionFields(Iterable iterable, AbstractC9896sy0 abstractC9896sy0) {
        HashSet hashSet = new HashSet();
        int i = AbstractC1472Li1.h;
        C1342Ki1 c1342Ki1 = new C1342Ki1();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            VF0 a = ((InterfaceC9395rX) it.next()).a();
            if (!hashSet.add(a)) {
                c1342Ki1.f(a);
                abstractC9896sy0.a(EnumC11438xU.z, "Multiple command handlers found for extension " + ((OX0) a).d.a);
            }
        }
        return c1342Ki1.g();
    }

    private static AbstractC0562Ei1 removeHandlersForExtensionFields(Iterable iterable, Set set, InterfaceC9989tE2 interfaceC9989tE2) {
        if (set.isEmpty()) {
            C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
            C0042Ai1 c0042Ai1 = new C0042Ai1();
            c0042Ai1.d(iterable);
            return ensureJSHandlerIsPresent(c0042Ai1, interfaceC9989tE2).f();
        }
        C0172Bi1 c0172Bi12 = AbstractC0562Ei1.g;
        C0042Ai1 c0042Ai12 = new C0042Ai1();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC9395rX interfaceC9395rX = (InterfaceC9395rX) it.next();
            if (!set.contains(interfaceC9395rX.a())) {
                c0042Ai12.c(interfaceC9395rX);
            }
        }
        return ensureJSHandlerIsPresent(c0042Ai12, interfaceC9989tE2).f();
    }

    private static C0042Ai1 ensureJSHandlerIsPresent(C0042Ai1 c0042Ai1, InterfaceC9989tE2 interfaceC9989tE2) {
        C0172Bi1 listIterator = c0042Ai1.f().listIterator(0);
        while (listIterator.hasNext()) {
            if (((OX0) ((InterfaceC9395rX) listIterator.next()).a()).d.a == JS_HANDLER_EXTENSION_ID) {
                return c0042Ai1;
            }
        }
        c0042Ai1.c((InterfaceC9395rX) interfaceC9989tE2.get());
        return c0042Ai1;
    }

    private static VY callHandler(InterfaceC9395rX interfaceC9395rX, CommandOuterClass$Command commandOuterClass$Command, AbstractC9053qX abstractC9053qX, long j) {
        Object a;
        VF0 a2 = interfaceC9395rX.a();
        commandOuterClass$Command.getClass();
        a2.getClass();
        OX0 ox0 = (OX0) a2;
        commandOuterClass$Command.v(ox0);
        C5563gM0 c5563gM0 = commandOuterClass$Command.j;
        NX0 nx0 = ox0.d;
        Object c = c5563gM0.c(nx0);
        if (c == null) {
            a = ox0.b;
        } else {
            nx0.getClass();
            a = ox0.a(c);
        }
        if (j > 0) {
            do {
            } while (System.nanoTime() < System.nanoTime() + (j * 1000000));
        }
        return interfaceC9395rX.c(a, abstractC9053qX);
    }

    private static int getCommandExtensionId(CommandOuterClass$Command commandOuterClass$Command) {
        try {
            byte[] byteArray = commandOuterClass$Command.toByteArray();
            AV f = DV.f(byteArray, 0, byteArray.length, false);
            if (f.e()) {
                return 0;
            }
            return f.B() >>> 3;
        } catch (IOException unused) {
            return -1;
        }
    }
}
