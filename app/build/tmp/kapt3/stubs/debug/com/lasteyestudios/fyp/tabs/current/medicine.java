package com.lasteyestudios.fyp.tabs.current;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0003\b\u0092\u0001\b\u0080\b\u0018\u00002\u00020\u0001B\u00d1\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010 \u001a\u0004\u0018\u00010\f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\f\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\f\u0012\b\u0010%\u001a\u0004\u0018\u00010\f\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\'\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010(\u001a\u0004\u0018\u00010\f\u0012\b\u0010)\u001a\u0004\u0018\u00010\f\u0012\b\u0010*\u001a\u0004\u0018\u00010\f\u0012\b\u0010+\u001a\u0004\u0018\u00010\f\u0012\b\u0010,\u001a\u0004\u0018\u00010\f\u0012\b\u0010-\u001a\u0004\u0018\u00010\f\u0012\b\u0010.\u001a\u0004\u0018\u00010\f\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\b\u00100\u001a\u0004\u0018\u00010\u0005\u0012\b\u00101\u001a\u0004\u0018\u00010\f\u0012\b\u00102\u001a\u0004\u0018\u00010\u0005\u0012\b\u00103\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u00104J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010l\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u000b\u0010m\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010o\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010s\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0010\u0010t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010u\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010v\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010w\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010x\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0010\u0010y\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0010\u0010z\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0010\u0010{\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0010\u0010|\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0010\u0010}\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0010\u0010~\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00109J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00109J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0095\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u0011\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010BJ\u00b8\u0004\u0010\u0098\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00103\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0003\u0010\u0099\u0001J\u0015\u0010\u009a\u0001\u001a\u00020\u00072\t\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u009c\u0001\u001a\u00020\fH\u00d6\u0001J\n\u0010\u009d\u0001\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0015\u0010/\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010:\u001a\u0004\b=\u00109R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u0015\u0010&\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010:\u001a\u0004\b@\u00109R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u0015\u0010%\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bD\u0010BR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bE\u0010BR\u0015\u00103\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bF\u0010BR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bG\u0010BR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\bH\u00106R\u0015\u0010\"\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bI\u0010BR\u0015\u00101\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bJ\u0010BR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\bK\u00106R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bL\u0010BR\u0015\u0010\u001d\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bM\u0010BR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bN\u0010BR\u0015\u0010$\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bO\u0010BR\u0015\u0010 \u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bP\u0010BR\u0015\u00102\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\bQ\u00106R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\bR\u00106R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\bS\u00106R\u0015\u0010!\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\bT\u00106R\u0015\u00100\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\bU\u00106R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\bV\u00106R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bW\u0010BR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bX\u0010BR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010<R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010<R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010<R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010<R\u0015\u0010+\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\b]\u0010BR\u0015\u0010*\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\b^\u0010BR\u0015\u0010-\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\b_\u0010BR\u0015\u0010,\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\b`\u0010BR\u0015\u0010(\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\ba\u0010BR\u0015\u0010)\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bb\u0010BR\u0015\u0010.\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u0010C\u001a\u0004\bc\u0010BR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010:\u001a\u0004\bd\u00109R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010<R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010:\u001a\u0004\bf\u00109R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010:\u001a\u0004\bg\u00109R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010<R\u0015\u0010\'\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010:\u001a\u0004\bi\u00109\u00a8\u0006\u009e\u0001"}, d2 = {"Lcom/lasteyestudios/fyp/tabs/current/medicine;", "", "name", "", "highmodifier", "", "highrange", "", "instructions", "messageMgs", "messageMls", "mgsmax", "", "mlsvar", "mgsmaxhigh", "mgsvar", "mgsvarstrephigh", "numberOfTimesADay", "nzflink", "strepdrug", "strepfrequency", "tabletOnly", "tabletSize", "mlsvarstreplow", "mlsvarstrep", "mgsvarstrep", "mlsstrepmax", "mgsstrepmax", "mlsvarstrephigh", "mgsvarstreplow", "mlsmax", "strepweightcutoff", "mlsmaxhigh", "mlsvaralt", "mgsvaralt", "numberOfTimesADayAlt", "mlsmaxalt", "mgsmaxalt", "messageshow", "weightrange", "rangeWeightCutOff", "rangeWeightCutOff2", "range1doseMls", "range1doseMgs", "range2doseMls", "range2doseMgs", "sachetsmax", "loadingdose", "mlsvarloading", "mgsvarloading", "mlsmaxloading", "mgsmaxloading", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;)V", "getHighmodifier", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getHighrange", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInstructions", "()Ljava/lang/String;", "getLoadingdose", "getMessageMgs", "getMessageMls", "getMessageshow", "getMgsmax", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMgsmaxalt", "getMgsmaxhigh", "getMgsmaxloading", "getMgsstrepmax", "getMgsvar", "getMgsvaralt", "getMgsvarloading", "getMgsvarstrep", "getMgsvarstrephigh", "getMgsvarstreplow", "getMlsmax", "getMlsmaxalt", "getMlsmaxhigh", "getMlsmaxloading", "getMlsstrepmax", "getMlsvar", "getMlsvaralt", "getMlsvarloading", "getMlsvarstrep", "getMlsvarstrephigh", "getMlsvarstreplow", "getName", "getNumberOfTimesADay", "getNumberOfTimesADayAlt", "getNzflink", "getRange1doseMgs", "getRange1doseMls", "getRange2doseMgs", "getRange2doseMls", "getRangeWeightCutOff", "getRangeWeightCutOff2", "getSachetsmax", "getStrepdrug", "getStrepfrequency", "getStrepweightcutoff", "getTabletOnly", "getTabletSize", "getWeightrange", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;)Lcom/lasteyestudios/fyp/tabs/current/medicine;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class medicine {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double highmodifier = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean highrange = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String instructions = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String messageMgs = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String messageMls = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer mgsmax = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double mlsvar = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer mgsmaxhigh = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double mgsvar = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer mgsvarstrephigh = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String numberOfTimesADay = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String nzflink = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean strepdrug = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String strepfrequency = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean tabletOnly = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tabletSize = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer mlsvarstreplow = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double mlsvarstrep = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double mgsvarstrep = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double mlsstrepmax = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer mgsstrepmax = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer mlsvarstrephigh = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer mgsvarstreplow = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer mlsmax = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean strepweightcutoff = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer mlsmaxhigh = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double mlsvaralt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer mgsvaralt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String numberOfTimesADayAlt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer mlsmaxalt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer mgsmaxalt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean messageshow = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean weightrange = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer rangeWeightCutOff = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer rangeWeightCutOff2 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer range1doseMls = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer range1doseMgs = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer range2doseMls = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer range2doseMgs = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer sachetsmax = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean loadingdose = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double mlsvarloading = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer mgsvarloading = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double mlsmaxloading = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer mgsmaxloading = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.lasteyestudios.fyp.tabs.current.medicine copy(@org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Double highmodifier, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean highrange, @org.jetbrains.annotations.Nullable()
    java.lang.String instructions, @org.jetbrains.annotations.Nullable()
    java.lang.String messageMgs, @org.jetbrains.annotations.Nullable()
    java.lang.String messageMls, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsmax, @org.jetbrains.annotations.Nullable()
    java.lang.Double mlsvar, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsmaxhigh, @org.jetbrains.annotations.Nullable()
    java.lang.Double mgsvar, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsvarstrephigh, @org.jetbrains.annotations.Nullable()
    java.lang.String numberOfTimesADay, @org.jetbrains.annotations.Nullable()
    java.lang.String nzflink, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean strepdrug, @org.jetbrains.annotations.Nullable()
    java.lang.String strepfrequency, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean tabletOnly, @org.jetbrains.annotations.Nullable()
    java.lang.String tabletSize, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mlsvarstreplow, @org.jetbrains.annotations.Nullable()
    java.lang.Double mlsvarstrep, @org.jetbrains.annotations.Nullable()
    java.lang.Double mgsvarstrep, @org.jetbrains.annotations.Nullable()
    java.lang.Double mlsstrepmax, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsstrepmax, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mlsvarstrephigh, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsvarstreplow, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mlsmax, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean strepweightcutoff, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mlsmaxhigh, @org.jetbrains.annotations.Nullable()
    java.lang.Double mlsvaralt, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsvaralt, @org.jetbrains.annotations.Nullable()
    java.lang.String numberOfTimesADayAlt, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mlsmaxalt, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsmaxalt, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean messageshow, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean weightrange, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rangeWeightCutOff, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rangeWeightCutOff2, @org.jetbrains.annotations.Nullable()
    java.lang.Integer range1doseMls, @org.jetbrains.annotations.Nullable()
    java.lang.Integer range1doseMgs, @org.jetbrains.annotations.Nullable()
    java.lang.Integer range2doseMls, @org.jetbrains.annotations.Nullable()
    java.lang.Integer range2doseMgs, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sachetsmax, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean loadingdose, @org.jetbrains.annotations.Nullable()
    java.lang.Double mlsvarloading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsvarloading, @org.jetbrains.annotations.Nullable()
    java.lang.Double mlsmaxloading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsmaxloading) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public medicine(@org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Double highmodifier, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean highrange, @org.jetbrains.annotations.Nullable()
    java.lang.String instructions, @org.jetbrains.annotations.Nullable()
    java.lang.String messageMgs, @org.jetbrains.annotations.Nullable()
    java.lang.String messageMls, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsmax, @org.jetbrains.annotations.Nullable()
    java.lang.Double mlsvar, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsmaxhigh, @org.jetbrains.annotations.Nullable()
    java.lang.Double mgsvar, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsvarstrephigh, @org.jetbrains.annotations.Nullable()
    java.lang.String numberOfTimesADay, @org.jetbrains.annotations.Nullable()
    java.lang.String nzflink, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean strepdrug, @org.jetbrains.annotations.Nullable()
    java.lang.String strepfrequency, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean tabletOnly, @org.jetbrains.annotations.Nullable()
    java.lang.String tabletSize, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mlsvarstreplow, @org.jetbrains.annotations.Nullable()
    java.lang.Double mlsvarstrep, @org.jetbrains.annotations.Nullable()
    java.lang.Double mgsvarstrep, @org.jetbrains.annotations.Nullable()
    java.lang.Double mlsstrepmax, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsstrepmax, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mlsvarstrephigh, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsvarstreplow, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mlsmax, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean strepweightcutoff, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mlsmaxhigh, @org.jetbrains.annotations.Nullable()
    java.lang.Double mlsvaralt, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsvaralt, @org.jetbrains.annotations.Nullable()
    java.lang.String numberOfTimesADayAlt, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mlsmaxalt, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsmaxalt, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean messageshow, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean weightrange, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rangeWeightCutOff, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rangeWeightCutOff2, @org.jetbrains.annotations.Nullable()
    java.lang.Integer range1doseMls, @org.jetbrains.annotations.Nullable()
    java.lang.Integer range1doseMgs, @org.jetbrains.annotations.Nullable()
    java.lang.Integer range2doseMls, @org.jetbrains.annotations.Nullable()
    java.lang.Integer range2doseMgs, @org.jetbrains.annotations.Nullable()
    java.lang.Integer sachetsmax, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean loadingdose, @org.jetbrains.annotations.Nullable()
    java.lang.Double mlsvarloading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsvarloading, @org.jetbrains.annotations.Nullable()
    java.lang.Double mlsmaxloading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer mgsmaxloading) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getHighmodifier() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getHighrange() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getInstructions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessageMgs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessageMls() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMgsmax() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMlsvar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMgsmaxhigh() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMgsvar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMgsvarstrephigh() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNumberOfTimesADay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNzflink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getStrepdrug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStrepfrequency() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getTabletOnly() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTabletSize() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMlsvarstreplow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMlsvarstrep() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMgsvarstrep() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMlsstrepmax() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMgsstrepmax() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMlsvarstrephigh() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMgsvarstreplow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMlsmax() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getStrepweightcutoff() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMlsmaxhigh() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMlsvaralt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMgsvaralt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNumberOfTimesADayAlt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMlsmaxalt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMgsmaxalt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getMessageshow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getWeightrange() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRangeWeightCutOff() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRangeWeightCutOff2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRange1doseMls() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRange1doseMgs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRange2doseMls() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRange2doseMgs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSachetsmax() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getLoadingdose() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMlsvarloading() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMgsvarloading() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component45() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMlsmaxloading() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component46() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMgsmaxloading() {
        return null;
    }
}