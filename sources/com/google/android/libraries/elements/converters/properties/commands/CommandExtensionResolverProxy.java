package com.google.android.libraries.elements.converters.properties.commands;

import com.google.android.libraries.elements.interfaces.JSCommandResolver;
import com.google.android.libraries.elements.interfaces.JSPromiseResolver;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import defpackage.AbstractC9053qX;
import defpackage.C10081tX;
import defpackage.C10239ty0;
import defpackage.C10424uX;
import defpackage.C10767vX;
import defpackage.C1127Ir1;
import defpackage.C2254Rj;
import defpackage.C6827k14;
import defpackage.C7931nE2;
import defpackage.InterfaceC9738sX;
import defpackage.QW2;
import defpackage.QX0;
import defpackage.XF0;
import io.grpc.Status;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class CommandExtensionResolverProxy extends JSCommandResolver {
    private final InterfaceC9738sX commandResolver;
    private final AbstractC9053qX eventData;

    public CommandExtensionResolverProxy(InterfaceC9738sX interfaceC9738sX, AbstractC9053qX abstractC9053qX) {
        this.commandResolver = interfaceC9738sX;
        this.eventData = abstractC9053qX;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSCommandResolver
    public Status resolve(byte[] bArr) {
        AtomicReference atomicReference = new AtomicReference(Status.f);
        try {
            XF0 d = XF0.d();
            CommandOuterClass$Command commandOuterClass$Command = CommandOuterClass$Command.l;
            int length = bArr.length;
            CommandOuterClass$Command commandOuterClass$Command2 = CommandOuterClass$Command.l;
            CommandOuterClass$Command commandOuterClass$Command3 = new CommandOuterClass$Command();
            try {
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b = c7931nE2.b(commandOuterClass$Command3.getClass());
                        b.f(commandOuterClass$Command3, bArr, 0, length + 0, new C2254Rj(d));
                        b.b(commandOuterClass$Command3);
                        if (commandOuterClass$Command3.a != 0) {
                            throw new RuntimeException();
                        }
                        QX0.i(commandOuterClass$Command3);
                        ((C10081tX) this.commandResolver).a(commandOuterClass$Command3, this.eventData, 1).b(new C10424uX(atomicReference));
                        return (Status) atomicReference.get();
                    } catch (C1127Ir1 e) {
                        if (e.g) {
                            throw new C1127Ir1(e);
                        }
                        throw e;
                    } catch (IndexOutOfBoundsException unused) {
                        throw C1127Ir1.h();
                    }
                } catch (IOException e2) {
                    if (e2.getCause() instanceof C1127Ir1) {
                        throw ((C1127Ir1) e2.getCause());
                    }
                    throw new C1127Ir1(e2);
                }
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (C1127Ir1 e4) {
            throw new C10239ty0("Failed to parse command.", e4);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.JSCommandResolver
    public void resolveAsync(byte[] bArr, JSPromiseResolver jSPromiseResolver) {
        if (jSPromiseResolver == null) {
            throw new C10239ty0("Failed to resolve command due to null JSPromiseResolver.");
        }
        try {
            XF0 d = XF0.d();
            CommandOuterClass$Command commandOuterClass$Command = CommandOuterClass$Command.l;
            int length = bArr.length;
            CommandOuterClass$Command commandOuterClass$Command2 = CommandOuterClass$Command.l;
            CommandOuterClass$Command commandOuterClass$Command3 = new CommandOuterClass$Command();
            try {
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b = c7931nE2.b(commandOuterClass$Command3.getClass());
                        b.f(commandOuterClass$Command3, bArr, 0, length + 0, new C2254Rj(d));
                        b.b(commandOuterClass$Command3);
                        if (commandOuterClass$Command3.a != 0) {
                            throw new RuntimeException();
                        }
                        QX0.i(commandOuterClass$Command3);
                        ((C10081tX) this.commandResolver).a(commandOuterClass$Command3, this.eventData, 1).b(new C10767vX(jSPromiseResolver));
                    } catch (IOException e) {
                        if (e.getCause() instanceof C1127Ir1) {
                            throw ((C1127Ir1) e.getCause());
                        }
                        throw new C1127Ir1(e);
                    } catch (IndexOutOfBoundsException unused) {
                        throw C1127Ir1.h();
                    }
                } catch (C6827k14 e2) {
                    throw e2.a();
                }
            } catch (C1127Ir1 e3) {
                if (e3.g) {
                    throw new C1127Ir1(e3);
                }
            }
        } catch (C1127Ir1 e4) {
            throw new C10239ty0("Failed to parse command.", e4);
        }
    }
}
