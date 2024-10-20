package com.google.android.libraries.elements.converters.properties.commands.fusion;

import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.CommandRunContext;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import defpackage.AbstractC9053qX;
import defpackage.C2924Wn;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FusionCommandRunContext extends CommandRunContext {
    private final ByteStore byteStore;
    private final AbstractC9053qX commandEventData;

    public FusionCommandRunContext(ByteStore byteStore, AbstractC9053qX abstractC9053qX) {
        this.byteStore = byteStore;
        this.commandEventData = abstractC9053qX;
    }

    public AbstractC9053qX commandEventData() {
        return this.commandEventData;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
    public final ByteStore byteStore() {
        return this.byteStore;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
    public final SenderStateOuterClass$SenderState senderState() {
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = ((C2924Wn) commandEventData()).e;
        return senderStateOuterClass$SenderState == null ? SenderStateOuterClass$SenderState.l : senderStateOuterClass$SenderState;
    }
}
