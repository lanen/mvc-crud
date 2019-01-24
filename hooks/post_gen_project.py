#!/usr/bin/env python
# -*- coding: utf-8 -*-

import logging
import os
import shutil

logging.basicConfig(level=logging.DEBUG)
logger = logging.getLogger('post_gen_project')


def move_files(src, dest):
    logger.info('Moving files from {} to {}'.format(src, dest))

    #for f in os.listdir(src):
    #    print(os.path.join(src, f))
    #    shutil.move(os.path.join(src, f), dest+'/' + src+'/')
    shutil.move(src, dest)
    #shutil.rmtree(src)

move_files('model', '{{cookiecutter.package|replace(":","/")}}')
move_files('dao', '{{cookiecutter.package|replace(":","/")}}')
move_files('service', '{{cookiecutter.package|replace(":","/")}}')
move_files('controller', '{{cookiecutter.package|replace(":","/")}}')
move_files('dto', '{{cookiecutter.package|replace(":","/")}}')
